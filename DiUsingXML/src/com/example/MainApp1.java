package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp1 {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
      
      GeometryExample1 geometryBean1=context.getBean("geometryExample1", GeometryExample1.class);
      geometryBean1.drawShape();
      
   }
}