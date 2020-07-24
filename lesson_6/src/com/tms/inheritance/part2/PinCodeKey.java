package com.tms.inheritance.part2;

public class PinCodeKey extends Key {
    public PinCodeKey() {
        super("Pin code key");
    }

    @Override
    protected void open() {
        System.out.println("Door is opened with " + type);
    }
}
