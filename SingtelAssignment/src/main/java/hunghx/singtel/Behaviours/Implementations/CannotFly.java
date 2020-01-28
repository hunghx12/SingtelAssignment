package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.FlyBehaviour;

public class CannotFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Oh no I cannot fly");
    }
}