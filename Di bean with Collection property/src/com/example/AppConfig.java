package com.example;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example")
public class AppConfig {
   @Bean
   public List<Employee> getEmployee() {
	  List<Employee> empList = new ArrayList<>();
	  empList.add(new Manager("Infotech"));
	  empList.add(new Manager("GlobalTech"));
	  empList.add(new Manager("NetFlix"));
      return empList;
   }
}
