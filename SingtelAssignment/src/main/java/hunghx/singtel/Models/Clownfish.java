package hunghx.singtel.models;

import hunghx.singtel.behaviours.interfaces.MakeJokeBehaviour;

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