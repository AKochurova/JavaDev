package com.zoo.animal;

public class Lion extends Animal implements Roarable, Huntable{
    protected void say() {
        System.out.println("Lion say");
    }

    public void roar() {
        System.out.println("roaring");
    }

    public void hunt() {
        System.out.println("hunting");
    }

    protected void walk() {
        System.out.println("walk");
    }

    protected void eat() {
        System.out.println("eat");
    }

    public Lion(){
        super();
    }
    public Lion(String name, int age, String color) {
        super(name, age, color);
    }
}
