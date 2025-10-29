package com.lobbie.a3.firstSpringApp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name) {
        return "hello, world!" + name;
    }
}
