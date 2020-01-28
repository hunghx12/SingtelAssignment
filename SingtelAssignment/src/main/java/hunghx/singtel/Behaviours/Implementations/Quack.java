package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;

public class Quack implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }

}