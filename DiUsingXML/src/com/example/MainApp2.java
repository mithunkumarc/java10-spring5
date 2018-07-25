package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp2 {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

      GeometryExample2 geometryBean2 = context.getBean("geometryExample2", GeometryExample2.class);
      geometryBean2.drawShape();

   }
}