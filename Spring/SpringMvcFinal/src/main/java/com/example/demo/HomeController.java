package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Repository.AlienRepo;
import com.example.demo.model.Alien;


@Controller
public class HomeController 
{
	@Autowired
	AlienRepo repo;
	
	
	@ModelAttribute
	public void name(Model m)
	{
		m.addAttribute("name", "Aliens");
	}
	
	
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("add")
	public String add(@RequestParam("name1")  int index,@RequestParam("name2") int index2,Model m)
	{
		
		
		int ans=index+index2;

		m.addAttribute("ans", ans);

		return "result";
	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a)
	{
		
		
		repo.save(a);
		
		return "result";
	}
	
	
	@GetMapping("getAlien")
	public String getAlien(Model m) 
	{
		
		m.addAttribute("result",repo.findById(1));
		return "showAliens";
	}
	
	@GetMapping("getAlienByName")
	public String getAlienByName(Model m) 
	{
		
		m.addAttribute("result",repo.findByName("Yash"));
		return "showAliens";
	}
	
	
	
	@GetMapping("getAliens")
	public String show(Model m) 
	{
		
		m.addAttribute("result",repo.findAll());
		return "showAliens";
	}
	
}
