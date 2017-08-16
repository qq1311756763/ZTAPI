package com.spic.spring.helloworld.impl;

import com.spic.spring.helloworld.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Struts Say Hello!!");
    }
}
