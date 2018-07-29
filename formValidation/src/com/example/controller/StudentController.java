package com.example.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Student;
import com.example.validator.StudentValidator;


@Controller
public class StudentController {

   @Autowired
   private StudentValidator studentValidator;
   
   @InitBinder
   protected void initBinder(WebDataBinder binder) {
      binder.addValidators(studentValidator);
   }

   @GetMapping("/")
   public String userForm(Locale locale,Model model) {
      model.addAttribute("student", new Student());
      return "studentForm";
   }

   /*
    * Save user object
    */
   @PostMapping("/saveStudent")
   public String saveUser(@ModelAttribute("student") @Validated Student student, BindingResult result,
         Model model) {

      if (result.hasErrors()) {
         return "studentForm";
      }
      return "success";
   }
}
