package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;

public class CockADoodleDoo implements SpeakBehaviour {

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }
}