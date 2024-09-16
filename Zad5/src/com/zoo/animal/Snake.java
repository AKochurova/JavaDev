package com.zoo.animal;

public class Snake extends Animal implements Crawlable, Biteable{
    protected void say() {
        System.out.println("Snake say");
    }

    public void crawl() {
        System.out.println("crawling");
    }

    public void bite() {
        System.out.println("biting");
    }

    protected void walk() {
        System.out.println("walk");
    }

    protected void eat() {
        System.out.println("eat");
    }

    public Snake(){
        super();
    }
    public Snake(String name, int age, String color) {

        super(name, age, color);
    }
}
