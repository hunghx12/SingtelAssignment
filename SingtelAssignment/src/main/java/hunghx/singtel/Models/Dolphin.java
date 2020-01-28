package hunghx.singtel.models;

import hunghx.singtel.behaviours.implementations.Swim;
import hunghx.singtel.behaviours.interfaces.SwimBehaviour;

public class Dolphin extends Animal {
    protected SwimBehaviour swimBehaviour;

    public Dolphin() {
        this.swimBehaviour = new Swim();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }
    
}