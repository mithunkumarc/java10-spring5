package com.example.controller;


import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

   /*
    * Binding a matrix variable to a method parameter
    */
	//link:http://localhost:8085/MatrixVariable/user/name=brendon
   @GetMapping("/user/{name}")
   @ResponseBody
   public String handler(@MatrixVariable("name") String name) {

      return "Matxrix variable <br> "
            + "name =" + name;
   }
   
   /*
    * Binding multiple matrix variables to  method parameters
    */
   //link:http://localhost:8085/MatrixVariable/user/firstName=Sidney/lastName=Sheldon
   @GetMapping("/user/{firstName}/{lastName}")
   @ResponseBody
   public String handler(@MatrixVariable("firstName") String firstName,
         @MatrixVariable("lastName") String lastName
         ) {

      return "<br>Matxrix variable <br> "
            + "firstName =" + firstName +"<br>"
            + "lastName =" + lastName;
   }
   
   /*
    * Binding matrix variables and path variables
    */
   //http://localhost:8085/MatrixVariable/employee/Mike;salary=45000;dept=HR
   @GetMapping("/employee/{name}")
   @ResponseBody
   public String handler(@PathVariable("name") String name,
         @MatrixVariable("salary") double salary,
         @MatrixVariable("dept") String dept
         ) {

      return "Path Variables <br>"
            + "name = "+ name +"<br>"
            + "<br>Matxrix variable <br> "
            + "salary =" + salary +"<br>"
            + "dept =" + dept;
   }
   
   /*
    * Binding matrix variables having same name in different path segments
    */
   //http://localhost:8085/MatrixVariable/employee/Mike;id=12;dept=HR;/India;id=25
   //mixed path var and matrix variable
   @GetMapping("/employee/{name}/{address}")
   @ResponseBody
   public String handler(@PathVariable("name") String name,
         @MatrixVariable(name="id", pathVar="name") int empId,
         @MatrixVariable("dept") String dept,
         @PathVariable("address") String address,
         @MatrixVariable(name="id", pathVar="name") int addrId
         ) {

      return "Path Variables <br>"
            + "name = "+ name +"<br>"
            + "address = "+ address +"<br>"
            + "<br>Matxrix variable <br> "
            + "empId =" + empId +"<br>"
            + "dept =" + dept +"<br>"
            + "addrId =" + addrId;
   }
   
   /*
    * Binding matrix variable with multiple values
    */
   //path and matrix param as list
   //link : http://localhost:8085/MatrixVariable/car/Audi;color=RED,BLACK,WHITE25
   @GetMapping("/car/{name}")
   @ResponseBody
   public String handler(@PathVariable("name") String name,
         @MatrixVariable("color") String[] color
         ) {

      return "Path Variables <br>"
            + "name = "+ name +"<br>"
            + "<br>Matxrix variable <br> "
            + "colors =" + Arrays.asList(color);
   }
   
   /*
    * Binding a matrix variable with optional and default value
    */
   //path and date and optional matrix param
   //link : http://localhost:8085/MatrixVariable/person/Mike;dob=2017-02-12
   @GetMapping("/person/{name}")
   @ResponseBody
   public String handler(@PathVariable("name") String name,
         @MatrixVariable("dob") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dob,
         @MatrixVariable(required=false, defaultValue="91XXXXXXXX") String mobile
         ) {

      return "Path Variables <br>"
            + "name = "+ name +"<br>"
            + "<br>Matxrix variable <br> "
            + "dob =" + dob +"<br>"
            + "mobile =" + mobile;
   }
}