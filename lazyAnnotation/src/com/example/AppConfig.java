package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

   @Bean("firstBean")
   @Lazy(value = true)
   public FirstBean getBeanOne() {
      return new FirstBean();
   }

   @Bean("secondBean")
   public SecondBean getBeanTwo() {
      return new SecondBean();
   }
}
