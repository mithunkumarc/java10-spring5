package com.example.bean;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
 
@Aspect
public class ExecuteAroundMethod {
 
    @Around("execution(* com.example.bean.MyBusinessService.runMyBusinessLogic(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        
        try{
        	System.out.println("Inside RunAfterExecution.beforeReturning() method...");
            Object result = joinPoint.proceed();
            System.out.println("Inside RunAfterExecution.afterReturning() method...");
            return result;
        } catch(Exception ne){
            throw ne;
        }
    }
}
