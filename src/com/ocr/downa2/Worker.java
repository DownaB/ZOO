package com.ocr.downa2;
import java.util.List;

public class Worker {
    protected String name;
    protected double pay;
    protected List<Integer> animals;


    public Worker(String name, double pay, List <Integer> animals) {
    this.name = name;
    this.pay = pay;
    this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return " Le salarié " + getName() + " gagne " + getPay();

    }
}

