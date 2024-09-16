package com.zoo.animal;

public class Zebra extends Animal {
    protected void say() {
        System.out.println("Zebra say");
    }

    protected void run() {
        System.out.println("running");
    }

    protected void drink() {
        System.out.println("drinking");
    }

    public Zebra(){
        super();
    }
    public Zebra(String name, int age, String color) {
        super(name, age, color);
    }
}
