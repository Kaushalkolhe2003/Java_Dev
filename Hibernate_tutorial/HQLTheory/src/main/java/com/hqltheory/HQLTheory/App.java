package com.hqltheory.HQLTheory;

import java.util.*;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

 
public class App 
{
    public static void main(String[] args)
    {
        // Configuration
        Configuration con = new Configuration().configure().addAnnotatedClass(MBABatch.class);
        StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties());

        // Create SessionFactory
        SessionFactory sf = con.buildSessionFactory(reg.build());
        
        // Open session
        Session session = null;
        Transaction tx = null;
        Random r = new Random();
        try {
            session = sf.openSession();
            tx = session.beginTransaction();
            
//            for(int i=0;i<=50;i++) {
//            	MBABatch m = new MBABatch();
//            	m.setRollno(i);
//            	m.setName("Name"+i);
//            	m.setMarks(r.nextInt(100));
//            	session.save(m);
//            }
            
            // q.list return list of rows
//            Query q = session.createQuery("from MBABatch where marks<=40");
//            List<MBABatch> student= q.list();
//           
//            for(MBABatch s : student) {
//            	System.out.println(s);
//            }
//            
//            
//            Query q2 = session.createQuery("from MBABatch where rollno=12");
//            MBABatch b = (MBABatch) q2.uniqueResult();
//            System.out.println(b);
//            
//            Query q3 = session.createQuery("select rollno,name,marks from MBABatch where rollno=11");
//            Object[] b1 = (Object[]) q3.uniqueResult();
//            
//            for(Object o : b1) {
//            	System.out.println(o);
//            
//            }
           /* 
            Query q4 = session.createQuery("select sum(marks) from MBABatch s where s.marks>60 " );
            Object marks = (Object) q4.uniqueResult();
            System.out.println(marks);
            
            Query q5 = session.createQuery("select rollno,name,marks from MBABatch s where s.marks>60");
            List<Object[]> students = (List<Object[]>) q5.list();
            
            for(Object[] s1: students ) {
            	System.out.println(s1[0]+ " : "+s1[1]+ " : "+s1[2]);
            }
            */
            //sql here called as native query .........
            
            SQLQuery query = session.createSQLQuery("select * from mbabatch where marks>60");
            query.addEntity(MBABatch.class);
            List<MBABatch> s= query.list();
            for(MBABatch b :s) {
            	System.out.println(b);
            }
            SQLQuery query1 = session.createSQLQuery("select name,marks from mbabatch where marks>60");
            query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            
            List s1= query1.list();
            for(Object b :s1) {
            	Map m = (Map)b;
            	System.out.println(m.get("name")+" : "+m.get("marks"));
            	
            }
           
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
