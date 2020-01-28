package hunghx.singtel.models;

import hunghx.singtel.behaviours.implementations.FlyWithWings;
import hunghx.singtel.behaviours.implementations.Quack;
import hunghx.singtel.behaviours.implementations.Swim;

public class Duck extends Bird {
    public Duck() {
        flyBehaviour = new FlyWithWings();
        speakBehaviour = new Quack();
        swimBehaviour = new Swim();
    }
}