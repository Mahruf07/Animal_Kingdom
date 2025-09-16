package org.example;

public abstract class Fish extends Animal {
    public Fish(double weight) {
        super(weight);
    }

    public void breathe() {
        System.out.println("Fish breath");
    }
}
