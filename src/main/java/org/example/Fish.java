package org.example;

public abstract class Fish extends Animal implements Swimmable {
    public Fish(double weight) {
        super(weight);
    }

    public void breathe() {
        System.out.println("Fish breath");
    }

    public abstract void layEggs();

    public void swim(){
        System.out.println("Fish is swimming...");
    }
}
