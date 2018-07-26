package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("icici")
public class ICICI extends BankAccount{
	@Override
	public void getSalary() {
		System.out.println("salary added to icici");
	}
}
