package com.mapping.Relation_Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class AppTest    
{
    public static void main(String []args) {
    	
    	Laptop laptop= new Laptop();
    	laptop.setLid(101);
    	laptop.setName("Acer");
    	
    	
    
    	
    	Student s= new Student();
    	s.setRoll_no(1);
    	s.setName("Kaushal");
    	s.setMarks(88);
    	s.getLaptop().add((laptop));
    	
    	laptop.getStudent().add(s);
    	
    	
    	// Configure Hibernate
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        StandardServiceRegistryBuilder regBuilder = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        
        SessionFactory sf = con.buildSessionFactory(regBuilder.build());
       
        Session session = sf.openSession();
        Transaction tx = null;

        try {
            session.beginTransaction();
            tx = session.getTransaction();
            session.save(laptop);
            session.save(s);
            tx.commit();  
        } catch(Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            sf.close();
        }
    }
}
