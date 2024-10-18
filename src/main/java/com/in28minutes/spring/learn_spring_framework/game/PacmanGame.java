package com.in28minutes.spring.learn_spring_framework.game;

import com.in28minutes.spring.learn_spring_framework.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    public void up()
    {
        System.out.println("PacMan Game Up");
    }
    public void down(){
        System.out.println("PacMan Game Down");
    }
    public void left(){
        System.out.println("PacMan Game left");
    }
    public void right(){
        System.out.println("PacMan Game Right");
    }
}
