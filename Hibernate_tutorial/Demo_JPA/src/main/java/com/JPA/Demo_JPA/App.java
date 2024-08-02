package com.JPA.Demo_JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Demo d1 = new Demo();
    	d1.setAid(5);
    	d1.setName("Rohan");
    	d1.setSkills("hardware");
    	EntityManagerFactory emf =Persistence.createEntityManagerFactory("TestPersistence");
    	EntityManager em= emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(d1);
    	em.getTransaction().commit();
    	
//        Demo d =  em.find(Demo.class,3);
//        System.out.println(d);
    }
}
