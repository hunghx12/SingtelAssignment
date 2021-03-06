package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.ButterflyBehaviour;

public class CaterpillarBehaviour implements ButterflyBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Cannot make a sound at all!");
    }

    @Override
    public void fly() {
        System.out.println("Oops cannot fly yet. Wait for me to be a beautiful butterfly!");
    }

    @Override
    public void walk() {
        System.out.println("I can crawl!");

    }
}