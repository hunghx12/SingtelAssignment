package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;

public class Sing implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("I am singing");
    }
}