package com.Project.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
	@Autowired
	Laptop lap;
	
    public void show() {
        lap.compile(); 
    	//System.out.println("Developer is showing something!");
    }
}