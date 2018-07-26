package com.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		SalaryAccount salaryAccount = context.getBean(SalaryAccount.class);
		salaryAccount.getBalance();
	}
}
