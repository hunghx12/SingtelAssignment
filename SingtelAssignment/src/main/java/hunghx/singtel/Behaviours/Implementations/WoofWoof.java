package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;

public class WoofWoof implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Woof, woof");
    }
}