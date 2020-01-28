package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Implementations.CannotFly;
import hunghx.singtel.Behaviours.Implementations.CockADoodleDoo;
import hunghx.singtel.Behaviours.Implementations.Swim;

public class Rooster extends Chicken {
    public Rooster() {
        flyBehaviour = new CannotFly();
        speakBehaviour = new CockADoodleDoo();
        swimBehaviour = new Swim();
    }
}