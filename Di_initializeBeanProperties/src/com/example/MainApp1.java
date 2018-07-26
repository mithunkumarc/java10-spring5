package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp1 {
   public static void main(String[] args) {
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
      Circle circle = context.getBean(Circle.class);
      circle.draw();
      context.close();      
   }
}