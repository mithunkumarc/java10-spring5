package com.example.dao;


import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

   public void doSomething() {
      System.out.println("Inside EmployeeDao's doSomething() method.");
   }
}
