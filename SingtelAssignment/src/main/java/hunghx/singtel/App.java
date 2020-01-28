package hunghx.singtel;

import hunghx.singtel.Behaviours.Implementations.CockADoodleDoo;
import hunghx.singtel.Behaviours.Implementations.Meow;
import hunghx.singtel.Behaviours.Implementations.WoofWoof;
import hunghx.singtel.Models.Bird;
import hunghx.singtel.Models.Chicken;
import hunghx.singtel.Models.Duck;
import hunghx.singtel.Models.Parrot;

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

        System.out.println("I am a parrot living with dogs. I will bark!");
        Bird parrotLiveNearDog = new Parrot(new WoofWoof());
        parrotLiveNearDog.performSing();

        System.out.println("I am a parrot, cats are my parent. Listen!");
        Bird parrotLiveNearCat = new Parrot(new Meow());
        parrotLiveNearCat.performSing();

        System.out.println("I am a parrot who is living near roosters. I can speak like them!");
        Bird parrotLiveNearRooster = new Parrot(new CockADoodleDoo());
        parrotLiveNearRooster.performSing();
    }
}
