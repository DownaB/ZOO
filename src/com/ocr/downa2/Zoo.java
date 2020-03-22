package com.ocr.downa2;

import java.util.ArrayList;
import java.util.List;


public class Zoo {

    protected String name;
    protected List<Animal> animal;
    protected List<Worker> worker;

    public Zoo(String name, Animal animal, Worker worker) {
        this.name = name;
        this.animal = (List<Animal>) animal;
        this.worker =(List<Worker>) worker;
    }

    public void addAnimal(Animal animal) {

        this.animal.add(animal);
    }

    public void addWorker(Worker worker){
        this.worker.add(worker);
    }

    public void recompense() {
        for (Worker workers : worker) {
            for (Animal animals : animal) {
                if (animals.eat) {
                    workers.pay = workers.pay + 50;
                    System.out.println("le salarié" + workers.name + "bénéficie d'une augenmentation de 50 euros, son salaire est maintenant de " + (workers.pay + 50) + "Euros");
                } else{
                    System.out.println("Le salarié " + workers.name + "ne bénéficie pas de l'augmentation de 50 euros ");
                }

            }
        }
    }

}
