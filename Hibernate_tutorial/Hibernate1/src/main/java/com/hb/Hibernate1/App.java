package com.hb.Hibernate1;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

 
public class App 
{
    public static void main( String[] args )
    {
//    	Vehicles c1 = new Vehicles();
//        c1.setID(1);
//        c1.setName("Tata Nexon");
//        c1.setColor("Grey");
//        Vehicles c2 = new Vehicles();
//        c2.setID(2);
//        c2.setName("Tata Safari") ;
//        c2.setColor("White");
//        Vehicles c3 = new Vehicles();
//        c3.setID(3);
//        c3.setName("Tata Harrier");
//        c3.setColor("Black");
    	Vehicles v1= new Vehicles();
    	
        Configuration con = new Configuration().configure().addAnnotatedClass(Vehicles.class);
        StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        
        SessionFactory sf =con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
       
//        session.save(c1);
//        session.save(c2);
//        session.save(c3);
       
        v1=(Vehicles) session.get(Vehicles.class, 2);
        
        session.getTransaction().commit();
        System.out.println(v1);
        
    }
}
