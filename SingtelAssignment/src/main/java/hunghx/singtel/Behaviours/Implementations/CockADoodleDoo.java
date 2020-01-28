package hunghx.singtel.Behaviours.Implementations;

import hunghx.singtel.Behaviours.Interfaces.SpeakBehaviour;

public class CockADoodleDoo implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }
}