package com.example.greeting;

public class GreetingService {

    public String greet(String name) {
        if (name == null ||  "".equals(name)) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

}
