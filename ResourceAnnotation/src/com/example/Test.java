package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * @Resource does the same thing as @Annotation
 * difference : approach 
 * 
 * @Autowired and @Inject : follow below flow
    Matches by Type
    Restricts by Qualifiers
    Matches by Name

	@Resource :	follow below flow
    Matches by Name
    Matches by Type
    Restricts by Qualifiers (ignored if match is found by name)

	
	
 * The JSR 250 @Resource annotation is used to mark a reference as a resource. 
 * This annotation may be applied on class, field and method.
	Spring supports injection using the @Resource annotation, 
	when it is applied on a field or setter method of a bean.
	The @Resource annotation follows by-name semantics i.e. 
	it takes a name attribute for injection, which is analogous to ‘autowiring by Name’ in XML based configuration.
	
	@Resource 	javax.annotation -	Java
	@Autowired 	org.springframework.bean.factory -	Spring
*/

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(AppConfig.class);
	      
	      Customer customer = context.getBean(Customer.class);
	      customer.deposit(5000);
	      
	      context.close();
	}
}
