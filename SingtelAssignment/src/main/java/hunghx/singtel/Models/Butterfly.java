package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Implementations.AdultButterflyBehaviour;
import hunghx.singtel.Behaviours.Implementations.CaterpillarBehaviour;
import hunghx.singtel.Behaviours.Interfaces.ButterflyBehaviour;

public class Butterfly extends Animal {
    protected ButterflyBehaviour butterflyBehaviour;

    public Butterfly() {
        butterflyBehaviour = new CaterpillarBehaviour();
    }

    public void performFly() {
        butterflyBehaviour.fly();
    }

    public void performWalk() {
        butterflyBehaviour.walk();
    }

    public void metamorphose(){
        butterflyBehaviour = new AdultButterflyBehaviour();
    }
}