package com.example;


public class Manager implements Employee {

	String companyName;
	
	public Manager(String companyName) {
		this.companyName = companyName;
	}
	
   @Override
   public void showEmployeeInfo() {
      System.out.println("Inside Manager showEmployeeInfo() method. "+this.companyName);
   }

}