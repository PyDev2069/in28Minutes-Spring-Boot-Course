package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("Jump bro!");
    }
    public void down(){
        System.out.println("Open Mouth");
    }
    public void left(){
        System.out.println("Swallow");
    }
    public void right(){
        System.out.println("Chase");
    }
}
