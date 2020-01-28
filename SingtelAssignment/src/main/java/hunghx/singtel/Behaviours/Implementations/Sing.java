package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;

public class Sing implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("I am singing");
    }
}