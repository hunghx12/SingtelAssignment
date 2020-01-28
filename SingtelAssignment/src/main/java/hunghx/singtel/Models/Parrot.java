package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;

public class Parrot extends Bird {

    public Parrot(SpeakBehaviour behaviour) {
        speakBehaviour = behaviour;
    }

    public void performSing() {
        speakBehaviour.makeSound();
    }
}