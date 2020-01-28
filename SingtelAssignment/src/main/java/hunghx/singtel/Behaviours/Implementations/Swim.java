package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.SwimBehaviour;

public class Swim implements SwimBehaviour {

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}