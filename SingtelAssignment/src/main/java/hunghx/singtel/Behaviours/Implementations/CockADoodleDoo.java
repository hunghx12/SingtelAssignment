package hunghx.singtel.behaviours.implementations;

import hunghx.singtel.behaviours.interfaces.SpeakBehaviour;

public class CockADoodleDoo implements SpeakBehaviour {

    private String cockADoodleDoo;

    public CockADoodleDoo(String cockADoodleDoo) {
        this.cockADoodleDoo = cockADoodleDoo;
    }

    public CockADoodleDoo() {
        this.cockADoodleDoo = "Cock-a-doodle-doo";
    }

    @Override
    public void makeSound() {
        System.out.println(cockADoodleDoo);
    }

    
}