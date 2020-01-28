package hunghx.singtel.models;

import hunghx.singtel.behaviours.implementations.FlyWithWings;
import hunghx.singtel.behaviours.implementations.Sing;
import hunghx.singtel.behaviours.implementations.Swim;
import hunghx.singtel.behaviours.interfaces.FlyBehaviour;
import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;
import hunghx.singtel.behaviours.interfaces.SwimBehaviour;

public class Bird extends Animal {
    protected FlyBehaviour flyBehaviour;
    protected SpeakBehaviour speakBehaviour;
    protected SwimBehaviour swimBehaviour;

    public Bird() {
        this.flyBehaviour = new FlyWithWings();
        this.speakBehaviour = new Sing();
        this.swimBehaviour = new Swim();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performSing() {
        speakBehaviour.makeSound();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void walk() {
        System.out.println("I am walking");
    }
}