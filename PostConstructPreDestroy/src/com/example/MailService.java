package com.example;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MailService {

   private Map<String, String> map=null;
   
   public MailService() {
      map=new HashMap<>();
   }

   public void send(String mailTo){
      //Code for sending mail
      System.out.println("Inside send method - "+mailTo);
   }
   
   @PostConstruct
   public void init() {
      map.put("host", "mail.example.com");
      map.put("port", "25");
      map.put("from", "admin@gmail.com");
      System.out.println("Inside init method - "+map);
   }

   @PreDestroy
   public void destroy() {
      map.clear();
      System.out.println("Inside destroy method - "+map);
   }
}

/* alternate for @PostConstruct and @PreDestroy annotations

   1.In AppConfig add below dependency
   2.remove @PostConstruct and @PreDestroy annotations
    
    @Bean(initMethod="init",destroyMethod="destroy")
      public MailService getMailService() {
      return new MailService();
   }

*/

