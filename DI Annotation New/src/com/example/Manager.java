package com.example;


public class Manager implements Employee {

   @Override
   public void showEmployeeInfo() {
      System.out.println("Inside Manager showEmployeeInfo() method.");
   }

}