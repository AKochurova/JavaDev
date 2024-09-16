package com.zoo.animal;

public class Hippo extends Animal implements Swimmable, Layable{
    protected void say() {
        System.out.println("Hippo say");
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void lay() {
        System.out.println("laying");
    }

    protected void walk() {
        System.out.println("walk");
    }

    protected void eat() {
        System.out.println("eat");
    }

    public Hippo(){
        super();
    }
    public Hippo(String name, int age, String color) {

        super(name, age, color);
    }
}
