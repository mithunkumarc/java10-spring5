package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = true)
public class SecondBean {

	   public SecondBean() {
	      System.out.println("Second bean Initialized");
	   }

	   public void doSomthing() {
	      System.out.println("Inside doSomthing() method of second bean");
	   }
	}