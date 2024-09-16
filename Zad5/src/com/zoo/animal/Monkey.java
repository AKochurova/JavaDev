package com.zoo.animal;

public class Monkey extends Animal implements Jumpable, Hangable {
    protected void say() {
        System.out.println("Monkey say");
    }

    public void jump() {
        System.out.println("jumping");
    }

    public void hang() {
        System.out.println("hanging");
    }

    protected void walk() {
        System.out.println("walk");
    }
    protected void eat() {
        System.out.println("eat");
    }
    public Monkey(){
        super();
    }
    public Monkey(String name, int age, String color) {

        super(name, age, color);
    }
}
