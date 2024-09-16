package com.zoo.animal;

public class Tiger extends Animal {
    protected void say() {
        System.out.println("Tiger say");
    }

    protected void chase() {
        System.out.println("chasing");
    }

    protected void climb() {
        System.out.println("climbing");
    }

    public Tiger(){
        super();
    }
    public Tiger(String name, int age, String color) {

        super(name, age, color);
    }
}
