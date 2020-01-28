package hunghx.singtel.Models;

import hunghx.singtel.Behaviours.Interfaces.MakeJokeBehaviour;

public class Clownfish extends Fish implements MakeJokeBehaviour{

    public Clownfish() {
        super();
        size = "small";
        colour = "colourful";
    }

    @Override
    public void makeJoke() {
        System.out.println("Haha I'm so funny");
    }
}