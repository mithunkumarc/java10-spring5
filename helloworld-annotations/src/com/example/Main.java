package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloWorldBean = context.getBean("myBean", HelloWorld.class);
		System.out.println(helloWorldBean.hello());
		
		
		/*
		 * beans.xml - <bean id="helloWorld" class="com.example.HelloWorld" />
		 * String confFile = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		HelloWorld helloWorldBean = context.getBean("helloWorld", HelloWorld.class);
		System.out.println(helloWorldBean.hello());*/
	}
}
