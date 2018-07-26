package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.service.EmployeeService;


public class MainApp {
   public static void main(String[] args) {

      @SuppressWarnings("resource")
      AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
      EmployeeService service1 = context1.getBean(EmployeeService.class);
      service1.doSomething();

   }
}
