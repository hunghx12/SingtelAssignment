package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}