package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Implementations.FlyWithWings;
import hunghx.singtel.Behaviours.Implementations.Sing;
import hunghx.singtel.Behaviours.Implementations.Swim;
import hunghx.singtel.Behaviours.Interfaces.FlyBehaviour;
import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;
import hunghx.singtel.Behaviours.Interfaces.SwimBehaviour;

public class Bird extends Animal {
    FlyBehaviour flyBehaviour;
    SpeakBehaviour speakBehaviour;
    SwimBehaviour swimBehaviour;

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
}