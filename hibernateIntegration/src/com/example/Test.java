package com.example;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.model.User;
import com.example.service.UserService;

public class Test {
  public static void main(String[] args) {
     AnnotationConfigApplicationContext context = 
           new AnnotationConfigApplicationContext(AppConfig.class);

     UserService userService = context.getBean(UserService.class);

     // Add Users
     userService.add(new User("rishab", "shetty", "rishab@example.com"));
     userService.add(new User("mika", "singh", "singhmika@example.com"));
     userService.add(new User("pankaj", "mishra", "pankajsir@example.com"));
     userService.add(new User("chirstine", "stewart", "stewartboston@example.com"));

     // Get Users
     List<User> users = userService.listUsers();
     for (User user : users) {
        System.out.println("Id = "+user.getId());
        System.out.println("First Name = "+user.getFirstName());
        System.out.println("Last Name = "+user.getLastName());
        System.out.println("Email = "+user.getEmail());
        System.out.println();
     }

     context.close();
  }
}