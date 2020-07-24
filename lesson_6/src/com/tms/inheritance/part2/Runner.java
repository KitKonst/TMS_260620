package com.tms.inheritance.part2;

public class Runner {
    public static void main(String[] args) {

        Door door = new Door();
        Key cardKey = new Card();
        Key steelKey = new StainlessSteelKey();
        Key pinCode = new PinCodeKey();

        door.openMe(cardKey);
        door.openMe(steelKey);
        door.openMe(pinCode);

    }
}
