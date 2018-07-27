package com.example.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HelloWorldController {
   
	///* entry view : welcome.jsp */
	@RequestMapping(path= {"/"},method=RequestMethod.GET)
	public String firstPage(Model model) {
		return "welcome";
	}
	
	
	
	
   @RequestMapping(path={"/link1"},method=RequestMethod.GET)
   public String sayHelloGet1(Model model) {	  
      model.addAttribute("message","get with @RequestMapping");     
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));      
      return "index";
   }
   
   
   @RequestMapping(path={"/link2"},method=RequestMethod.POST)
   public String sayHelloPost1(Model model) {	  
      model.addAttribute("message","post with @RequestMapping");     
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));      
      return "index";
   }
   
   @GetMapping(value="/link3")
   public String sayHelloGet2(Model model) {	  
      model.addAttribute("message","get with @GetMapping");     
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));      
      return "index";
   }
   
   @PostMapping(value="/link4")
   public String sayHelloPost2(Model model) {	  
      model.addAttribute("message","post with @PostMapping");     
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));      
      return "index";
   }
   
  
   
}
