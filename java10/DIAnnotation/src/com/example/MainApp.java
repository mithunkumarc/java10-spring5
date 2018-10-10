package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/* 
	@Configuration in AppConfig class
	Spring Configuration annotation indicates that the class has @Bean definition methods. 
   	So Spring container can process the class and generate Spring Beans to be used in the application.
*/
public class MainApp {
	   public static void main(String[] args) {
	      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	      Company company = context.getBean(Company.class);
	      company.showEmployeeInfo();
	      context.close();
	   }
	}
