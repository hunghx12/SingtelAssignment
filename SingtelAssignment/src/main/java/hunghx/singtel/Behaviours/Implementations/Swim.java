package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.SwimBehaviour;

public class Swim implements SwimBehaviour {

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}