package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Repository;

@Repository //? Repo annotation means in this bean i am speaking with a database 
public class MySQLDataService implements DataService {

    @Override
    public int[] retrieveData(){
        return new int[] {1,2,3,4,5};
    }
}
