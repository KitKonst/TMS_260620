package com.tms.inheritance.part2;

public class Door {

    public void openMe(Key key) {
        System.out.println("Attemp to open door with: " + key.type);
        key.open();
    }
}
