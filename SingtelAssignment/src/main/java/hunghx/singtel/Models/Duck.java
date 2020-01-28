package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Implementations.FlyWithWings;
import hunghx.singtel.Behaviours.Implementations.Quack;
import hunghx.singtel.Behaviours.Implementations.Swim;

public class Duck extends Bird {
    public Duck() {
        flyBehaviour = new FlyWithWings();
        speakBehaviour = new Quack();
        swimBehaviour = new Swim();
    }
}