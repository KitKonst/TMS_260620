package com.tms.inheritance.part2;

public abstract class Key {

    protected String type;

    public Key(String type) {
        this.type = type;
    }

    protected abstract void open();
}
