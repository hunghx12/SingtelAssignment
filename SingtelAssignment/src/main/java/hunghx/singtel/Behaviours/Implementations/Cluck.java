package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;

public class Cluck implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }
}