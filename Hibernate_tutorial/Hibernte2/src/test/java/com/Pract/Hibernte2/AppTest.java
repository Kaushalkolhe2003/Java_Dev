package com.Pract.Hibernte2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class AppTest {
    public static void main(String[] args) {
        Biodata bd1 = new Biodata();
        bd1.setId(1);
        bd1.setName("Kaushal");
        bd1.setGender("Male");
        bd1.setPhonenumber("7887458667");
        Biodata bd2= new Biodata();
        bd2.setId(2);
        bd2.setName("Aditya");
        bd2.setGender("Male");
        bd2.setPhonenumber("8080335735");
        
        Biodata bd3= new Biodata();
        bd3.setId(3);
        bd3.setName("Yash");
        bd3.setGender("Male");
        bd3.setPhonenumber("8956536757");
        
        Biodata bd4= new Biodata();
        bd4.setId(4);
        bd4.setName("Omkar");
        bd4.setGender("Male");
        bd4.setPhonenumber("9890436326");
        
        

        Configuration con = new Configuration().configure().addAnnotatedClass(Biodata.class);
        StandardServiceRegistryBuilder regBuilder = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        
        SessionFactory sf = con.buildSessionFactory(regBuilder.build());
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        try {
            // Save new records
//            session.save(bd1);
//            session.save(bd2);
//            session.save(bd3);
            session.save(bd4);

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
