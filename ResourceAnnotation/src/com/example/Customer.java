package com.example;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private BankAccount bankAccount;
	
	@Resource(name="icici")
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void deposit(float amount) {
		System.out.println("deposited "+amount+ " to "+bankAccount.accountNumber);
	}	
}
