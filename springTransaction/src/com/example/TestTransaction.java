package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Address;
import com.example.model.Customer;
import com.example.service.CustomerManager;
import com.example.service.CustomerManagerImpl;

public class TestTransaction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		CustomerManager customerManager = ctx.getBean("customerManager",
				CustomerManagerImpl.class);

		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("Ranjit");
		Address address = new Address();
		address.setId(2);
		address.setCountry("India");		
		// even though customer inserted to database successfully, it will be 
		// rolled back by spring transaction because address fail to make it to database.
		//// setting value more than 20 chars, so that SQLException occurs
		address.setAddress("whitefield, Bangalore, KA 500782");
		//uncomment below and run , it will work
		address.setAddress("Mission Road");
		customer.setAddress(address);
		return customer;
	}

}
