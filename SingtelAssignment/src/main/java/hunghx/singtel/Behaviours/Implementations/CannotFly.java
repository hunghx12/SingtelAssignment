package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.FlyBehaviour;

public class CannotFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Oh no I cannot fly");
    }
}