package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * 
 * spring will create bean objs when app is started.
 * if bean is assigned lazy annotation , that bean will be skipped.
 * By default, the Spring IoC container creates and initializes all singleton beans at time of application start up. 
 * We can prevent this pre initialization of a singleton beans by using the @Lazy annotation.
*/
public class Main {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      //Initialize lazy bean
      System.out.println("now first bean initializing");
      FirstBean bean=context.getBean(FirstBean.class);
      bean.doSomthing();
      context.close();
   }
}