package com.example;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {

	   public FirstBean() {
	      System.out.println("first bean Initialized");
	   }

	   public void doSomthing() {
	      System.out.println("Inside doSomthing() method of first");
	   }
	}