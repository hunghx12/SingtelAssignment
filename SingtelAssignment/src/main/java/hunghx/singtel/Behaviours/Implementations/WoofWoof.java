package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;

public class WoofWoof implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Woof, woof");
    }
}