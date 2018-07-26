package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

  	/*
  	 * default scope of bean is : singleton
  	In Spring framework, we can manage lifecycle of a bean by using method-level annotations 
  	@PostConstruct and @PreDestroy.
	The @PostConstruct annotation is used on a method that needs to be executed after 
	dependency injection is done to perform any initialization.
	The @PreDestroy annotation is used on methods as a callback notification to signal that 
	the instance is in the process of being removed by the container.
	The following examples demonstrate the use of @PostConstruct and @PreDestroy annotations.
	Consider the MailService bean, whose init() and destroy() methods are annotated with 
	@PostConstruct and @PreDestroy annotations respectively.
	*/

public class MainApp {
	   public static void main(String[] args) {
	      AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(AppConfig.class);
	      
	      
	      // Send mail 1
	      MailService mailService1 = context.getBean(MailService.class);
	      mailService1.send("user1@example.com");

	      // Send mail 2
	      MailService mailService2 = context.getBean(MailService.class);
	      mailService2.send("uesr2@example.com");

	      context.close();
	   }
	}


/*
 * output :
 * 	Inside init method - {port=25, host=mail.example.com, from=admin@gmail.com}
	Inside send method - user1@example.com
	Inside send method - uesr2@example.com
	Inside destroy method - {}
 */
