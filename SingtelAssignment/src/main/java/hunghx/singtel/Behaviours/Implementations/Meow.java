package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;

public class Meow implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}