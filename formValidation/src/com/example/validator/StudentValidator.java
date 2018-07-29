package com.example.validator;


import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.model.Student;


@Component
public class StudentValidator implements Validator {

   @Override
   public boolean supports(Class<?> clazz) {
      return Student.class.equals(clazz);
   }

   @Override
   public void validate(Object obj, Errors err) {

      ValidationUtils.rejectIfEmpty(err, "name", "student.name.empty");
      ValidationUtils.rejectIfEmpty(err, "email", "student.email.empty");
      ValidationUtils.rejectIfEmpty(err, "gender", "student.gender.empty");
      ValidationUtils.rejectIfEmpty(err, "subjects", "student.subjects.empty");

      Student user = (Student) obj;

      Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
      if (!(pattern.matcher(user.getEmail()).matches())) {
         err.rejectValue("email", "student.email.invalid");
      }

   }

}