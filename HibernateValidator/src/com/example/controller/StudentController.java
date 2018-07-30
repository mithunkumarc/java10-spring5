package com.example.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Student;

@Controller
public class StudentController {

   @GetMapping("/")
   public String studentForm(Locale locale,Model model) {
      model.addAttribute("student", new Student());
      return "studentForm";
   }

   @PostMapping("/saveStudent")
   public String saveUser(@ModelAttribute("student") @Valid Student student, BindingResult result,
         Model model) {

      if (result.hasErrors()) {
         return "studentForm";
      }
      return "success";
   }
}
