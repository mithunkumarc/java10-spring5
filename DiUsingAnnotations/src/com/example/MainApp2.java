package com.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp2 {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
      Rectangle rectangle = context.getBean(Rectangle.class);
      rectangle.draw();
      context.close(); 
   }
}