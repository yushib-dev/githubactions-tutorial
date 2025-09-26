package com.github.actions.tutorial;

public class GreetingService {

    public String greet(String name) {
        if (name == null ||  "".equals(name)) {
            return "こんにちは、ゲストさん！";
        }
        return "こんにちは、" + name + "さん！";
    }

}
