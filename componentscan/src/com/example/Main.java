package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* 
 * The @ComponentScan annotation scans all beans 
 * whose class is annotated by @Component annotation 
 * in a package specified by basePackages attribute.
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