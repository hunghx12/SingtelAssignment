package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.ButterflyBehaviour;

public class AdultButterflyBehaviour implements ButterflyBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Cannot make a sound at all!");
    }

    @Override
    public void fly() {
        System.out.println("Flyyyy. I am a beautiful butterfly!");
    }

    @Override
    public void walk() {
        System.out.println("I can walk normal now!");

    }
}