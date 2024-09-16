package com.zoo.animal;

public class Lion extends Animal {
    protected void say() {
        System.out.println("Lion say");
    }

    protected void roar() {
        System.out.println("roaring");
    }

    protected void hunt() {
        System.out.println("hunting");
    }

    public Lion(){
        super();
    }
    public Lion(String name, int age, String color) {
        super(name, age, color);
    }
}
