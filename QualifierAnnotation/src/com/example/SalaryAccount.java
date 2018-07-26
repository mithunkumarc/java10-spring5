package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryAccount {
	BankAccount bankAccount;
	
	@Autowired
	@Qualifier("icici")
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public void getBalance() {
		this.bankAccount.getSalary();
	}
}
