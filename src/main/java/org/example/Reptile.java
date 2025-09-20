package org.example;

public abstract class Reptile extends Animal implements Walkable,Swimmable{
    public Reptile(double weight){
        super(weight);
    }

    public void breathe() {
        System.out.println("Reptile breath");
    }

    public abstract void baskInSun();

    @Override
    public void walk(){
        System.out.println("Reptile is walking...");
    }

    @Override
    public void swim(){
        System.out.println("Reptile is swimming...");
    }
}
