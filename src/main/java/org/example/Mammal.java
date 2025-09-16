package org.example;

public abstract class Mammal extends Animal{
    public Mammal(double weight) {
        super(weight);
    }

    @Override
    public void breathe() {
        System.out.println("Mammal breath");
    }
}
