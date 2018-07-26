package com.example;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

   private List<Employee> employeeList;

   // Constructor based DI
   @Autowired
   public Company(List<Employee> employeeList) {
      this.employeeList = employeeList;
   }

   public void showEmployeeInfo() {
      for(Employee emp  : this.employeeList) {
    	  emp.showEmployeeInfo();
      }
   }

}