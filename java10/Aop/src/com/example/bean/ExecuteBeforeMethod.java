package com.example.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ExecuteBeforeMethod {
 
    @Before("execution(* com.example.bean.MyBusinessService.runMyBusinessLogic(..))")
    public void invoke() throws Throwable {         
        System.out.println("*** before advice ***");        
    }
}
