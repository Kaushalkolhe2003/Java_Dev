package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Repository.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController 
{
	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens",produces = {"application/xml"})
	@ResponseBody
	public List<Alien> getALien()
	{
		List<Alien> aliens=repo.findAll();
		return aliens;
	}
	
	@GetMapping("alien/{aid}")
	@ResponseBody
	public Alien get(@PathVariable("aid") int id)
	{
		Alien alien=repo.findById(id).orElse(null);
		return alien;
	}
	
	@PostMapping(path="alien",consumes={"application/xml"})
	public void addAlien(@RequestBody Alien a)
	{
		repo.save(a);
	}
	
	
}
