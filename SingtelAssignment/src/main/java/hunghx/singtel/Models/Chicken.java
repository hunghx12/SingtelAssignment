package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Implementations.CannotFly;
import hunghx.singtel.Behaviours.Implementations.Cluck;
import hunghx.singtel.Behaviours.Implementations.Swim;

public class Chicken extends Bird {
    public Chicken() {
        flyBehaviour = new CannotFly();
        speakBehaviour = new Cluck();
        swimBehaviour = new Swim();
    }
}