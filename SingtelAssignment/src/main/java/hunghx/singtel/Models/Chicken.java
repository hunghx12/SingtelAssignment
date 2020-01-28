package hunghx.singtel.models;

import hunghx.singtel.behaviours.implementations.CannotFly;
import hunghx.singtel.behaviours.implementations.Cluck;
import hunghx.singtel.behaviours.implementations.Swim;

public class Chicken extends Bird {
    public Chicken() {
        flyBehaviour = new CannotFly();
        speakBehaviour = new Cluck();
        swimBehaviour = new Swim();
    }
}