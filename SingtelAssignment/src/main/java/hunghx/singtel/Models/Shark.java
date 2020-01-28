package hunghx.singtel.models;

import hunghx.singtel.behaviours.interfaces.EatBehaviour;

public class Shark extends Fish implements EatBehaviour {
   
    public Shark() {
        super();
        size = "large";
        colour = "grey";
    }

    @Override
    public void eat(Fish fish) {
        System.out.println("This " + fish.getColour() + " is so delicious!");
    }
}