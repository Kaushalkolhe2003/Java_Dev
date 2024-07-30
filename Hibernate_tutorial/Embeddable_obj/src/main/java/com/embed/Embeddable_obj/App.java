package com.embed.Embeddable_obj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Create instances of Std_Data and Parent_info
//        Std_Data s1 = new Std_Data();
//        s1.setRoll_no(1);
//        s1.setName("Aniket");
//        s1.setGender("Male");
//        s1.setBlood_grp("A-");
//        
//        Parent_info p = new Parent_info();
//        p.setFather_N("Mohan");
//        p.setMother_N("Arti");
//        p.setMobile_no("8967334567");
//        
//        s1.setP(p);  // Set the Parent_info in Std_Data
        
        Std_Data s2 = new Std_Data();
        s2.setRoll_no(2);
        s2.setName("Ram");
        s2.setGender("Male");
        s2.setBlood_grp("B+");
        
        Parent_info p2 = new Parent_info();
        p2.setFather_N("Suresh");
        p2.setMother_N("Sujata");
        p2.setMobile_no("9078456723");
        
        s2.setP(p2);  // Set the Parent_info in Std_Data

        // Configure Hibernate
        Configuration con = new Configuration().configure().addAnnotatedClass(Std_Data.class);
        StandardServiceRegistryBuilder regBuilder = new StandardServiceRegistryBuilder().applySettings(con.getProperties());

        

        // Create SessionFactory
        SessionFactory sf = con.buildSessionFactory(regBuilder.build());
        Session session = sf.openSession();
        Transaction tx = null;

        try {
            // Start a transaction
            tx = session.beginTransaction();

            // Save Std_Data instance
         //   session.save(s1);
            session.save(s2);

            // Commit transaction
            tx.commit();
        } catch (Exception e) {
            // Rollback transaction on error
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close session and factory
            session.close();
            sf.close();
        }
    }
}
