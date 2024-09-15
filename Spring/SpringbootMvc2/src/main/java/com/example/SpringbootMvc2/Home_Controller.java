package com.example.SpringbootMvc2;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringbootMvc2.model.Devloper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Home_Controller {
	@ModelAttribute
	public void modeldata(Model m) {
		m.addAttribute("name","India");
	}
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	@RequestMapping("add")
	public String add(@RequestParam("num1")int  i ,@RequestParam("num2") int j,Model m)  {
		
		
		
		
		int num3=i+j;
		m.addAttribute("num3",num3);
		
		return "result";
	}
	/*
	@RequestMapping("addDev")
	public String addDev(@RequestParam("id")int  id ,@RequestParam("name") String name ,Model m)  {
		
		
		Devloper dev = new Devloper();
		
		dev.setId(id);
		dev.setName(name);
		
		m.addAttribute("Dev",dev);
		return "result";
	}
	*/
	 
	//using method and value attributes in requestmapping help to set post..
	
	/*
	 * 
	@RequestMapping(value="addDev" , method=RequestMethod.POST)
	public String addDev( @ModelAttribute("d1")Devloper d )  {
		
		
		return "result";
	}
	 */
	
	//using annotation of postmapping
	@PostMapping(value="addDev")
	public String addDev( @ModelAttribute("d1")Devloper d )  {
		
		
		return "result";
	}
	@GetMapping("getDevloper")
	public String getDevloper(Model m) {
		
		
		List<Devloper> d= Arrays.asList(new Devloper(1,"Kaushal KOlhe"), new Devloper(2,"Yash Thakur"),new Devloper(3,"Aditya Damare"));
		m.addAttribute("result",d);
		return "showDev";
	}
	
}
