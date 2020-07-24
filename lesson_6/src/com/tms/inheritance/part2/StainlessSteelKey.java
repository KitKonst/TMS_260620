package com.tms.inheritance.part2;

public class StainlessSteelKey extends Key{
    public StainlessSteelKey() {
        super("Regular stainless still key");
    }

    @Override
    protected void open() {
        System.out.println("Door is opened with " + type);
    }
}
