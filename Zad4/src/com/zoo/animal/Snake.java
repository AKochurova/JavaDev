package com.zoo.animal;

public class Snake extends Animal {
    protected void say() {
        System.out.println("Snake say");
    }

    protected void crawl() {
        System.out.println("crawling");
    }

    protected void bite() {
        System.out.println("biting");
    }

    public Snake(){
        super();
    }
    public Snake(String name, int age, String color) {

        super(name, age, color);
    }
}
