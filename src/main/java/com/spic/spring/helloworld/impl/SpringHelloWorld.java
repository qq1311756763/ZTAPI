package com.spic.spring.helloworld.impl;

import com.spic.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Spring Say Hello!!");
    }
}
