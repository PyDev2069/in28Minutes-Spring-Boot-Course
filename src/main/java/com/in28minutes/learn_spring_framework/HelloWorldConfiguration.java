package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Rounak";
    }
    @Bean
    public int age(){
        return 21;
    }
    @Bean
    public Person person(){
        return new Person("Ravi", 20, new Address("Main Street", "Boston"));
    }
    @Bean
    public Address address(){
        return new Address("129/Bentinck Street", "Kolkata");
    }

    //making beans from other beans
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

     @Bean
    public Person person3Parameters(String name, int age, Address address){
        return new Person(name, age, address );
    }

}
