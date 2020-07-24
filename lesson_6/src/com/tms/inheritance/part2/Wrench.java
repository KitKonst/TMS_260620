package com.tms.inheritance.part2;

public abstract class Wrench extends Key {

    public Wrench(String type) {
        super(type);
    }

    protected abstract void pinch();

}
