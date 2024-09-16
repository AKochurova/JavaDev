package com.zoo.animal;

public class Peacock extends Animal {
    protected void say() {
        System.out.println("Peacock say");
    }

    protected void fly() {
        System.out.println("flying");
    }

    protected void sing() {
        System.out.println("singing");
    }

    public Peacock(){
        super();
    }
    public Peacock(String name, int age, String color) {

        super(name, age, color);
    }
}

