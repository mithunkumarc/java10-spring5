package com.example.bean;

import org.springframework.context.ConfigurableApplicationContext;

public class SpringDemo {
 
    public static void main(String a[]){
 
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context = 
                        new org.springframework.context.support.ClassPathXmlApplicationContext(confFile);
        MyBusinessService busServ = (MyBusinessService) context.getBean("busService");
        busServ.runMyBusinessLogic();  
    }
}