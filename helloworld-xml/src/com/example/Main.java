package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String confFile = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		HelloWorld helloWorldBean = context.getBean("helloWorld", HelloWorld.class);
		System.out.println(helloWorldBean.hello());
	}
}
