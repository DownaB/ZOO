package com.ocr.downa2;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Beauval", (new Animal(1, "dahut", 3,true)),(new Worker ("Martin", 1200.6,Arrays.asList(1,2))));

        zoo1.addAnimal(new Animal (2, "yeti", 120, false));
        zoo1.addAnimal(new Animal (3, "tigre", 60, true ));
        zoo1.addAnimal(new Animal (4, "zebre", 10, true));
        zoo1.addWorker(new Worker("Jean", 1230.5,Arrays.asList(3,4)));

 System.out.println(zoo1);


  //recompense(animals, workers);
    }
}
