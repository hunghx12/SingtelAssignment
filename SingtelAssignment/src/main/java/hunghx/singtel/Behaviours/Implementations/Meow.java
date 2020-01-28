package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;

public class Meow implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}