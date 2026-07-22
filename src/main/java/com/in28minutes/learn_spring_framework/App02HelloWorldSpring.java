package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //* 1 Launch a spring context */

        var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //* 2  Configure the things we want spring to manage - @configuration class */

        //* 3 Retrieve a bean from hello world configuration */
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

        //alternative
        System.out.println(context.getBean(Address.class));

        //calling the mixed up beans
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));

    }   
}
