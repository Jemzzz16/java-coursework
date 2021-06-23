package com.company;

public class Dog {
    private String breed;
    private String name;
    private int age;

    // constructor - runs on build -> sets the fields / keys from data
    public Dog (String breed, String name, int age){
        this.breed = breed;
        this.name = name;
        this.age =age;
    }
    // getter -> keeps fields private -> get the value from the class
    public int getAge() {
        return this.age;
    }

    // setter -> keeps field private -> set / update the value from the class
    // setter -> ass validation

    public void setAge(int newAge) {
        if (newAge < 1) {
            this.age = 1;
        } else {
            this.age = newAge;
        }
    }













}
