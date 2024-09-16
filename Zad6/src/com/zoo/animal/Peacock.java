package com.zoo.animal;

public class Peacock extends Animal implements Flyable, Singable{
    protected void say() {
        System.out.println("Peacock say");
    }

    public void fly() {
        System.out.println("flying");
    }

    public void sing() {
        System.out.println("singing");
    }

    protected void walk() {
        System.out.println("walk");
    }

    protected void eat() {
        System.out.println("eat");
    }

    public Peacock(){
        super();
    }
    public Peacock(String name, int age, String color) {

        super(name, age, color);
    }
}

