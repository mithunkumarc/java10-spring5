package com.example;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hdfc")
public class HDFC extends BankAccount{
	@Override
	public void getSalary() {
		System.out.println("salary added to hdfc");
	}
}
