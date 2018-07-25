package com.example.bean;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ExecuteAfterMethod {
 
    @After("execution(* com.example.bean.MyBusinessService.runMyBusinessLogic(..))")
    public void invoke() throws Throwable {
         
        System.out.println("**** after advice ****"+new Date());
        
    }
}
