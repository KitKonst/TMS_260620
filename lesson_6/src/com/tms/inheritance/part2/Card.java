package com.tms.inheritance.part2;

public class Card extends Key {

    public Card() {
        super("Plastic card key");
    }

    @Override
    protected void open() {
        System.out.println("Door is opened with " + type);
    }
}
