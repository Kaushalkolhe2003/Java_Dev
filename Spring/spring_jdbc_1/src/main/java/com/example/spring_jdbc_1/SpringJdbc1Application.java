package com.example.spring_jdbc_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.spring_jdbc_1.model.Holidays;
import com.example.spring_jdbc_1.repo.Repo_1;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(SpringJdbc1Application.class, args);
		Holidays s1= context.getBean(Holidays.class);
		Holidays s2= context.getBean(Holidays.class);
		/*
		s1.setId(1);
		s1.setName("Yash Thakur");
		s1.setTicket_ID(123001);
		s1.setLunch("CHicken");
		*/
		
//		s2.setId(2);
//		s2.setName("Aditya Damare");
//		s2.setTicket_ID(123002);
//		s2.setLunch("Chicken kabaab");
	
		/*
			
		s3.setId(4);
		s3.setName("Kaushal Kolhe");
		s3.setTicket_ID(123003);
		s3.setLunch("Veg Thali");
		
		s4.setId(5 );
		s4.setName("Omkar Bagad");
		s4.setTicket_ID(123004);
		s4.setLunch("CHicken Noodles");
		
		*/
		
		Repo_1 r1 = context.getBean(Repo_1.class);
		
//		r1.save(s2);
		
		System.out.println(r1.findAll());
		
	}

}
