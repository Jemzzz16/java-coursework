package com.company;

public class Main {
    public static void main(String[] args ) {
        Person charlie = new Person();

        System.out.println(charlie.name);
        System.out.println(charlie.age);
        System.out.println(charlie.greet(
                "Jemma"));

        Dog max = new Dog(
                "pointer",
                "max",
                5);

        Dog rover = new Dog(
                "bull dog",
                "old man",
                8);

        System.out.println(max.getAge());
        max.setAge(7);
        rover.setAge(-5);
        System.out.println(max.getAge());
        System.out.println(rover.getAge());
    }



}