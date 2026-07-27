package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * SuperContra
 */
@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContra implements GamingConsole {
    public void up(){
        System.out.println("Go UP");
    }
    public void down(){
        System.out.println("Duck");
    }
    public void left(){
        System.out.println("Reload");
    }
    public void right(){
        System.out.println("Fire");
    }
}
