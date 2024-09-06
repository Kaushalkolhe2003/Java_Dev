package com.Emp.Spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      //  BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	Employee obj1= (Employee) factory.getBean("employeeXM");
        obj1.Devlopement();
        System.out.println(obj1.getSalary());
        
        
//        Employee obj2= (Employee) factory.getBean("employeeXM");
//        obj2.Devlopement();
//       obj2.salary=23000;
//        System.out.println(obj2.salary);
        
        
    }
}
