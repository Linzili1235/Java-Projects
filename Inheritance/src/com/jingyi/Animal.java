package com.jingyi;

public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal eat called");

    }
    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
