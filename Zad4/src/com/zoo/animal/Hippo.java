package com.zoo.animal;

public class Hippo extends Animal {
    protected void say() {
        System.out.println("Hippo say");
    }

    protected void swim() {
        System.out.println("swimming");
    }

    protected void lay() {
        System.out.println("laying");
    }

    public Hippo(){
        super();
    }
    public Hippo(String name, int age, String color) {

        super(name, age, color);
    }
}
