package com.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	@Bean(name="myBean")
	public HelloWorld getHelloWorld(){
		return new HelloWorld();
	}
}
/*
 * above class equivalent to 
 * <?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
	
	<bean id="myBean" class="com.example.HelloWorld" />
	
</beans>
 */
