package hunghx.singtel;

import hunghx.singtel.Models.Bird;
import hunghx.singtel.Models.Chicken;
import hunghx.singtel.Models.Duck;

public class App {
    public static void main(String[] args) {
        System.out.println("I am a bird.");
        Bird bird = new Bird();
        bird.walk();
        bird.performFly();
        bird.performSing();

        System.out.println("I am a chicken. I will folow the bird!");
        Bird chicken = new Chicken();
        chicken.walk();
        chicken.performFly();
        chicken.performSing();

        System.out.println("I am a duck. Watch me");
        Bird duck = new Duck();
        duck.walk();
        duck.performFly();
        duck.performSing();
        duck.performSwim();
    }
}
