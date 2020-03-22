package com.ocr.downa2;

public class Girafe extends Animal {
 protected int sizeNeck;

    public Girafe (int id, String name, int age, boolean eat, int sizeNeck){
        super (id, name, age, eat);
        this.sizeNeck = sizeNeck;
    }

    public int getSizeNeck() {
        return sizeNeck;
    }
}
