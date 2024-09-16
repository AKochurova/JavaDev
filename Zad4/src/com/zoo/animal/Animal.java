package com.zoo.animal;

public class Animal {
    protected String name = "Animal";
    protected int age;
    protected String color;

    protected void say() {
        System.out.println("Animal say");
    }

    //два общих метода
    protected void walk() {
        System.out.println("walk");
    }

    protected void eat() {
        System.out.println("eat");
    }


    public Animal() {

    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
