package com.awa.main.Bean;

public class Man {

    private SaySomething saySomething;
    private String name;
    private Hand hand;

    public void speakLoud(){
        System.out.println("The man " + name + " says " + saySomething.saySomething());
    }

}
