package com.ocr.downa2;

public class Elephant extends Animal {
   protected int sizeTrunk;
    protected int sizeEars;

    public Elephant (int id, String name, int age, boolean eat, int sizeTrunk, int sizeEars) {
        super (id, name, age, eat);
        this.sizeTrunk = sizeTrunk;
        this.sizeEars= sizeEars;
    }

    public int getSizeTrunk() {
        return sizeTrunk;
    }

    public int getSizeEars() {
        return sizeEars;
    }
}
