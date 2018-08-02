package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.example.config.AppConfig;
import com.example.model.Car;
import com.example.model.CarPark;
import com.example.spel.Arithmetic;
import com.example.spel.Collections;
import com.example.spel.Conditional;
import com.example.spel.Logical;
import com.example.spel.Regex;
import com.example.spel.Relational;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
        
        //uncomment and run one by one to see the result
        
        /*set prop of object using arithmetic operators
        Arithmetic arithmetic = (Arithmetic) context.getBean(Arithmetic.class);
        System.out.println(arithmetic);*/
        
        /*set prop of object using logical operators
        Logical logical = (Logical) context.getBean(Logical.class);
        System.out.println(logical);*/
        
        /*set prop of object using relational operators
        Relational relational = (Relational)context.getBean(Relational.class);
        System.out.println(relational);*/
        
        /*set properties of object using conditional operators
        Conditional conditional = (Conditional)context.getBean(Conditional.class);
        System.out.println(conditional);*/
        
        
        /*regular expression
         * Regex regex = (Regex)context.getBean(Regex.class);
        System.out.println(regex);
        */
        
        //parser
        /*Car car = new Car();
        car.setMake("Good manufacturer");
        car.setModel("Model 3");
        car.setYearOfProduction(2014);

        CarPark carPark = new CarPark();

        SpelParserConfiguration config = new SpelParserConfiguration(true, true);

        StandardEvaluationContext spcontext = new StandardEvaluationContext(carPark);
        
        ExpressionParser expressionParser = new SpelExpressionParser(config);
        //adding car object to carpark
        expressionParser.parseExpression("cars[0]").setValue(spcontext, car);
        //get first car from carpark
        Car result = carPark.getCars().get(0);

        System.out.println(result);*/
        
        //collections
        Collections collections = context.getBean(Collections.class);
        System.out.println(collections);
        
        
    }

}