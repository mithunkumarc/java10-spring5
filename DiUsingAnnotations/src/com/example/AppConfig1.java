package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* base package , root package common for all classes
 * Eg:
 * com.example.beans
 * com.example.dao
 * in the above example, com.example is the base package
 * */
@Configuration
@ComponentScan(basePackages="com.example")
public class AppConfig1 {
   @Bean
   public Circle getCircle() {
      return new Circle();
   }
}