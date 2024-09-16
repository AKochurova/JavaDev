package com.zoo.animal;

public class Zebra extends Animal implements Runnable, Drinkable {
    protected void say() {
        System.out.println("Zebra say");
    }

    public void run() {
        System.out.println("running");
    }

    public void drink() {
        System.out.println("drinking");
    }

    protected void walk() {
        System.out.println("walk");
    }

    protected void eat() {
        System.out.println("eat");
    }

    public Zebra(){
        super();
    }
    public Zebra(String name, int age, String color) {
        super(name, age, color);
    }
}
