package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Implementations.Swim;
import hunghx.singtel.Behaviours.Interfaces.SwimBehaviour;

public class Dolphin extends Animal {
    protected SwimBehaviour swimBehaviour;

    public Dolphin() {
        this.swimBehaviour = new Swim();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }
    
}