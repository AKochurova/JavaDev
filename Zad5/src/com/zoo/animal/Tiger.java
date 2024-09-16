package com.zoo.animal;

public class Tiger extends Animal implements Chaseable, Climbable{
    protected void say() {
        System.out.println("Tiger say");
    }

    public void chase() {
        System.out.println("chasing");
    }

    public void climb() {
        System.out.println("climbing");
    }

    protected void walk() {
        System.out.println("walk");
    }

    protected void eat() {
        System.out.println("eat");
    }

    public Tiger(){
        super();
    }
    public Tiger(String name, int age, String color) {

        super(name, age, color);
    }
}
