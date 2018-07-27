package com.example.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	public String getMessage() {
		return "hello world spring";
	}
}
