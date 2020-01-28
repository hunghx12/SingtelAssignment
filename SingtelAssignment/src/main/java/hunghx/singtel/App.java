package hunghx.singtel;

import java.util.Locale;
import java.util.ResourceBundle;

import hunghx.singtel.behaviours.implementations.CockADoodleDoo;
import hunghx.singtel.behaviours.implementations.Meow;
import hunghx.singtel.behaviours.implementations.WoofWoof;
import hunghx.singtel.models.Bird;
import hunghx.singtel.models.Chicken;
import hunghx.singtel.models.Duck;
import hunghx.singtel.models.Parrot;
import hunghx.singtel.models.Rooster;

public class App {
    public static void main(String[] args) {
        ResourceBundle bundle;

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

        System.out.println("I am a Vietnamese rooster!");
        Locale.setDefault(new Locale("vi", "VN"));
        bundle = ResourceBundle.getBundle("hunghx.singtel.properties.internationalization.MessageBundle");
        Bird vietnameseRooster = new Rooster(new CockADoodleDoo(bundle.getString("speak")));
        vietnameseRooster.performSing();

        System.out.println("I am a Japanese rooster!");
        Locale.setDefault(new Locale("ja", "JP"));
        bundle = ResourceBundle.getBundle("hunghx.singtel.properties.internationalization.MessageBundle");
        Bird japaneseRooster = new Rooster(new CockADoodleDoo(bundle.getString("speak")));
        japaneseRooster.performSing();
    }
}
