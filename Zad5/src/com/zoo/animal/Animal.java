package com.zoo.animal;

import com.zoo.exception.EmptyNameException;
import com.zoo.exception.NegativeValueException;

interface Runnable {
    void run();
}
interface Drinkable {
    void drink();
}
interface Chaseable {
    void chase();
}
interface Climbable{
    void climb();
}
interface Jumpable{
    void jump();
}
interface Hangable{
    void hang();
}
interface Roarable{
    void roar();
}
interface Huntable{
    void hunt();
}
interface Swimmable {
    void swim();
}
interface Layable{
    void lay();
}
interface Flyable{
    void fly();
}
interface Singable{
    void sing();
}
interface Crawlable{
    void crawl();
}
interface Biteable{
    void bite();
}
public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;

    protected abstract void say();

    protected abstract void walk();

    protected abstract void eat();

    //метод с перегрузкой

        protected void getProperties (String name,int age, String color){
        System.out.println(name + "/n" + age + "/n" + color);
    }

        protected void getProperties ( int age, String color){
        System.out.println(age + "/n" + color);
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
            try{
                if(name==null) throw new EmptyNameException("Exception: name is null");
            }catch (EmptyNameException e){
                System.out.println(e.getMessage());
            }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
            try{
            if (age<=0){
                throw new NegativeValueException("Exception: age cannot be negative");
            }
            }catch (NegativeValueException e){
                System.out.println(e.getMessage());
            }
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
