package com.First;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	@RequestMapping("aliens")
	public List<Alien> getAliens(){
		List<Alien> aliens= new ArrayList<>();
		
		Alien a1= new Alien();
		a1.setID(1);
		a1.setName("Kaushal");
		a1.setMarks(60);
		
		Alien a2= new Alien();
		a2.setID(2);
		a2.setName("Yash");
		a2.setMarks(65);

		aliens.add(a1);
		aliens.add(a2);
		
		
		return aliens;
	}
}
