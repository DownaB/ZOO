package com.ocr.downa2;


 public class Animal {
    protected int id;
    protected String name;
    protected int age;
    protected boolean eat;

    public Animal (int id, String name, int age, boolean eat) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.eat = eat;
    }

    public int getId() {
        return id;
    }
    public String getName () {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getEat() {
        return eat;
    }

     public void setAge(int age) {
         this.age = age;

         if(this.age <= 100){
             System.out.println("Age valide");
         } else {
             System.out.println("Age non valide");
         }
     }

     @Override
    public String toString() {
        return " Identifiant " + getId() + " espèce " + getName() + " âgé de " + getAge();
    }
}
