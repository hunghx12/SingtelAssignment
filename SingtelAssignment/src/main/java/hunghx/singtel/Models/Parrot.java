package hunghx.singtel.models;

import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;

public class Parrot extends Bird {

    public Parrot(SpeakBehaviour behaviour) {
        speakBehaviour = behaviour;
    }

    public void performSing() {
        speakBehaviour.makeSound();
    }
}