package com.jingyi;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(  int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight); //the class we are extending from
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Dog chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog walk called");
        super.move(5);
    }
    public void run(){
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog move called");
        super.move(speed);

    }
}
