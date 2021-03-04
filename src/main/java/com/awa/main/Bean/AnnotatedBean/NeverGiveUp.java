package com.awa.main.Bean.AnnotatedBean;


import com.awa.iocframework.annotation.Autowired;
import com.awa.iocframework.annotation.Component;

@Component(name = "ngu")
public class NeverGiveUp implements DoSomething {

    @Autowired
    Woman woman;

    @Override
    public String doSomething() {
        return "Never Give Up!";
    }
}
