package hunghx.singtel.models;

import hunghx.singtel.behaviours.implementations.Swim;
import hunghx.singtel.behaviours.interfaces.SwimBehaviour;

public abstract class Fish extends Animal {
    protected SwimBehaviour swimBehaviour;
    protected String size;
    protected String colour;

    public Fish() {
        this.swimBehaviour = new Swim();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    
}