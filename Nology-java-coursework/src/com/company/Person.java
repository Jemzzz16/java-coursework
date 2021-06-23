package com.company;

public class Person {
    public String name = "Charluie";
    public int age = 30;//

    // scope return string/int/char which is return type then the method name
    // then inside () return type your passing in
    public String greet(String toGreet) {
        // do stuff
        return "hello" + toGreet + "my name is" + this.name;
    }
}
