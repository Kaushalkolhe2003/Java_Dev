package com.persistent_LifeCycle.Persistent_Life_Cycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure().addAnnotatedClass(Lapi.class);
        StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties());

        // Create SessionFactory
        SessionFactory sf = con.buildSessionFactory(reg.build());
        Session session = null;
        Transaction tx = null;

        try {
            session = sf.openSession();
            tx = session.beginTransaction();

        //get vs Load  
          //everytime you use get it will hit database 
            Lapi l = session.get(Lapi.class,5);
            System.out.println(l);
         //load will give you proxy object
            
            Lapi l2= session.load(Lapi.class, 4);
            Thread.sleep(4000);
            System.out.println(l2);
            
            // Commit the transaction
            tx.commit();
            
            
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
            if (sf != null) {
                sf.close();
            }
        }
    }
}
