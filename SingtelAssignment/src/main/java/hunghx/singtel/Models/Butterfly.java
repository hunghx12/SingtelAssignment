package hunghx.singtel.models;

import hunghx.singtel.behaviours.implementations.AdultButterflyBehaviour;
import hunghx.singtel.behaviours.implementations.CaterpillarBehaviour;
import hunghx.singtel.behaviours.interfaces.ButterflyBehaviour;

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