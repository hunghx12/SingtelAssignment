package hunghx.singtel.models;

import hunghx.singtel.behaviours.implementations.CannotFly;
import hunghx.singtel.behaviours.implementations.CockADoodleDoo;
import hunghx.singtel.behaviours.implementations.Swim;
import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;

public class Rooster extends Chicken {
    public Rooster() {
        flyBehaviour = new CannotFly();
        speakBehaviour = new CockADoodleDoo();
        swimBehaviour = new Swim();
    }

    public Rooster(SpeakBehaviour speakBehaviour) {
        flyBehaviour = new CannotFly();
        swimBehaviour = new Swim();
        this.speakBehaviour = speakBehaviour;
    }
}