package com.zoo.animal;

public class Monkey extends Animal {
    protected void say() {
        System.out.println("Monkey say");
    }

    protected void jump() {
        System.out.println("jumping");
    }

    protected void hang() {
        System.out.println("hanging");
    }

    public Monkey(){
        super();
    }
    public Monkey(String name, int age, String color) {

        super(name, age, color);
    }
}
