package com.Example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Example.springmvc.model.Devloper;


@Controller
public class Home_Controller {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@ModelAttribute
	public void modelData(Model m) {
		
		m.addAttribute("name","India");
	}
	/*
	 * @RequestMapping("add")
	public String addition(HttpServletRequest req) {
		
		int x=Integer.parseInt(req.getParameter("num1"));
		int y=Integer.parseInt(req.getParameter("num2"));
		
		int z=x+y;
		
		HttpSession session =req.getSession();
		
		session.setAttribute("num3", z);
		
		return "result.jsp";
	}
	*/
	
	/*
public ModelAndView addition( @RequestParam("num1") int i ,@RequestParam("num2")int j ) {
		//using @RequestParam("num") int i ,@RequestParam("num2") int j
		
		//avoiding the httpsession
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("result");
		
		int z=i+j;
		mv.addObject("num3", z);
		
		
		return mv;
	}
	*/
	//using just model object in place of Modelview or use Modelmap object 
	public String addition( @RequestParam("num1") int i ,@RequestParam("num2")int j ,Model m) {
		//using @RequestParam("num") int i ,@RequestParam("num2") int j
		
		//avoiding the httpsession
		
		
		
		
		int z=i+j;
		m.addAttribute("num3", z);
		
		
		return "result";
	}
	
	/*
	@RequestMapping("addDevloper")
	public String Dev(@RequestParam("id") int  id ,@RequestParam("name")String name,Model m) {
		
		Devloper d1= new Devloper();
		d1.setAid(id);
		d1.setName(name);
		
		m.addAttribute("devloper",d1);
		
		return "result";
	}
	*/
	//using model attributes in annotation to avoid the requestparam parameter in method...
	//without using modelattribute it works 
	@RequestMapping("addDevloper")
	public String Dev(@ModelAttribute ("D1") Devloper d) {
		
		
		
		
		return "result";
	}
	
	
}
