package com.example.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bean.HelloWorld;
import com.example.config.RootConfig;


@Controller
public class HelloWorldController {
   
   @RequestMapping(path={"/hello"},method=RequestMethod.GET)
   public String sayHello(Model model) {
	   
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
	  HelloWorld helloWorld = context.getBean(HelloWorld.class);
      model.addAttribute("message",helloWorld.getMessage());
     
      //Java 8 LocalDate
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));
      
      return "index";
   }
}
