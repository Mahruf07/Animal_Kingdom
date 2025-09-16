package org.example;

public abstract class Reptile extends Animal{
    public Reptile(double weight){
        super(weight);
    }

    public void breathe() {
        System.out.println("Reptile breath");
    }
}
