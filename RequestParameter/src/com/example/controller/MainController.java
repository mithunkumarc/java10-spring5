package com.example.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

  /*
    * Binding a request parameter to a method parameter using 'name' or 'value'
    * attribute of @RequestParam
    */
	//link : http://localhost:8080/RequestParameter/request1?name=croatia
   @RequestMapping("/request1")
   @ResponseBody
   public String handler(@RequestParam(name = "name") String name) {

	  /*not using jsp to send response , directly sending as response using @ResponseBody*/ 
      return "URL parameter <br> " 
            + "name =" + name;
   }

  /*
    * Binding request parameters to method parameters without using 'name' or
    * 'value' attribute of @RequestParam.
    */
   //link : http://localhost:8080/RequestParameter/request2?firstName=ryan&lastName=dahl
   @RequestMapping("/request2")
   @ResponseBody
   public String handler(@RequestParam String firstName, @RequestParam String lastName) {

      return "URL parameters - <br>" 
            + " firstName = " + firstName + " <br>" 
            + " lastName = " + lastName;
   }

  /*
    * If method parameter type is not String then Spring automatically converts
    * to the appropriate type such as int, long, float etc.
    */
   //link : http://localhost:8080/RequestParameter/request3?name=David&age=32&amount=1200.50&active=1
   @RequestMapping("/request3")
   @ResponseBody
   public String handler(@RequestParam("name") String name, 
         @RequestParam("age") int age,
         @RequestParam("amount") double amount, 
         @RequestParam("active") boolean active) {

      return "URL parameters - <br>" 
            + " name = " + name + " <br>" 
            + " age = " + age + " <br>" 
            + " amount = " + amount
            + " <br>" + " active = " + active;
   }

  /*
    * Binding all request parameters to Map
    */
   // link : http://localhost:8080/RequestParameter/request4?name=ravindra&age=32&country=India&city=Jaipur
   @RequestMapping("/request4")
   @ResponseBody
   public String handler(@RequestParam Map<String, String> params) {

      StringBuilder builder = new StringBuilder();
      builder.append("URL parameters - <br>");
      for (Entry<String, String> entry : params.entrySet()) {
         builder.append(entry.getKey() + " = " + entry.getValue() + "<br>");
      }
      return builder.toString();
   }

  /*
    * The required=false attribute of @RequestParam annotation is used to make
    * method parameter as Optional i.e. it bind a null value to method parameter
    * if request parameter is not present.
    */
   // link : http://localhost:8080/RequestParameter/request5?firstName=Jack&lastName=Sparrow
   @RequestMapping("/request5")
   @ResponseBody
   public String handler(@RequestParam("firstName") String firstName,
         @RequestParam(name = "middleName", required = false) String middleName,
         @RequestParam("lastName") String lastName) {

      return "URL parameters - <br>" 
            + " firstName = " + firstName + " <br>" 
            + " middleName = " + middleName + " <br>"
            + " lastName = " + lastName;
   }

  /*
    * Binding date and time request parameters to LocalDate and LocalTime
    * using @DateTimeFormat and @RequestParam
    */
   //link : http://localhost:8080/RequestParameter/request6?date=2017-12-12&time=12:54:52
   @RequestMapping("/request6")
   @ResponseBody
   public String handler(
         @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam("date") LocalDate date,
         @DateTimeFormat(pattern = "HH:mm:ss") @RequestParam("time") LocalTime time) {

      return "URL parameters - <br>" 
            + " date = " + date + " <br>" 
            + " time = " + time;
   }

  /*
    * Binding request parameter to array and list
    */
   //http://localhost:8080/RequestParameter/request7?country=USA&country=India&country=Japan&city=Jaipur&city=Delhi&city=Jakarta
   //output : country = [USA, India, Japan] 
   //output : city = [Jaipur, Delhi, Jakarta]
   @RequestMapping("/request7")
   @ResponseBody
   public String handler(@RequestParam("country") String[] country, 
         @RequestParam("city") List<String> city) {

      return "URL parameters - <br>" 
            + " country = " + Arrays.asList(country) + " <br>" 
            + " city = " + city;
   }

  /*
    * Using default value of a method parameter if request parameter is not
    * provided or has an empty value
    */
   //link ; http://localhost:8080/RequestParameter/request8
   @RequestMapping("/request8")
   @ResponseBody
   public String handler(@RequestParam(name = "code", defaultValue = "10") int code
        ) {

      return "URL parameters - <br>" 
            + " code = " + code;
   }

}
