package hunghx.singtel;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hunghx.singtel.behaviours.implementations.CockADoodleDoo;
import hunghx.singtel.behaviours.implementations.Meow;
import hunghx.singtel.behaviours.implementations.WoofWoof;
import hunghx.singtel.models.Bird;
import hunghx.singtel.models.Butterfly;
import hunghx.singtel.models.Chicken;
import hunghx.singtel.models.Clownfish;
import hunghx.singtel.models.Dolphin;
import hunghx.singtel.models.Duck;
import hunghx.singtel.models.Fish;
import hunghx.singtel.models.Parrot;
import hunghx.singtel.models.Rooster;
import hunghx.singtel.models.Shark;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * Test case for bird walking
     */
    @Test
    public void testBirdWalking() {
        // Bird walking
        Bird bird = new Bird();
        bird.walk();
        assertEquals("Bird walking incorrectly", "I am walking\n", outContent.toString());
    }

    /**
     * Test case for chicken walking
     */
    @Test
    public void testChickenWalking() {
        Bird chicken = new Chicken();
        chicken.walk();
        assertEquals("Chicken walking incorrectly", "I am walking\n", outContent.toString());
    }

    /**
     * Test case for bird flying
     */
    @Test
    public void testBirdFlying() {
        Bird bird = new Bird();
        bird.performFly();
        assertEquals("Bird flying incorrectly", "I am flying\n", outContent.toString());
        System.setOut(originalOut);
    }

    /**
     * Test case for chicken flying
     */
    @Test
    public void testChickenFlying() {
        Bird chicken = new Chicken();
        chicken.performFly();
        assertEquals("Chicken flying incorrectly", "Oh no I cannot fly\n", outContent.toString());
    }

    /**
     * Test case for bird singing
     */
    @Test
    public void testBirdSinging() {
        Bird bird = new Bird();
        bird.performSing();
        assertEquals("Bird singing incorrectly", "I am singing\n", outContent.toString());
    }

    /**
     * Test case for chicken singing
     */
    @Test
    public void testChickenSinging() {
        Bird chicken = new Chicken();
        chicken.performSing();
        assertEquals("Chicken singing incorrectly", "Cluck, cluck\n", outContent.toString());
    }

    /**
     * Test case for duck swimming
     */
    @Test
    public void testDuckSwimming() {
        Bird chicken = new Duck();
        chicken.performSwim();
        assertEquals("Duck swimming incorrectly", "I am swimming\n", outContent.toString());
    }

    /**
     * Test case for rooster sound
     */
    @Test
    public void testRoosterSpeaking() {
        Bird rooster = new Rooster();
        rooster.performSing();
        assertEquals("Rooster speaking incorrectly", "Cock-a-doodle-doo\n", outContent.toString());
    }

    /**
     * Test case for rooster sound
     */
    @Test
    public void testParrotLiveWithCatSpeaking() {
        Bird parrot = new Parrot(new Meow());
        parrot.performSing();
        assertEquals("Parrot speaking incorrectly", "Meow\n", outContent.toString());
    }

    /**
     * Test case for rooster sound
     */
    @Test
    public void testParrotLiveWithDogSpeaking() {
        Bird parrot = new Parrot(new WoofWoof());
        parrot.performSing();
        assertEquals("Parrot speaking incorrectly", "Woof, woof\n", outContent.toString());
    }

    /**
     * Test case for shark eating fish
     */
    @Test
    public void testSharkEatingFish() {
        Shark shark = new Shark();
        Fish clownfish = new Clownfish();
        shark.eat(clownfish);
        assertEquals("Shark eating incorrectly", "This " + clownfish.getColour() + " is so delicious!\n", outContent.toString());
    }

    /**
     * Test case for clown fish making joke
     */
    @Test
    public void testClownFishMakingJoke() {
        Clownfish clownfish = new Clownfish();
        clownfish.makeJoke();
        assertEquals("Clownfish making joke incorrectly", "Haha I'm so funny\n", outContent.toString());
    }

    /**
     * Test case for dolphin swimming
     */
    @Test
    public void testDolphinSwimming() {
        Dolphin dolphin = new Dolphin();
        dolphin.performSwim();
        assertEquals("Dolphin swimming incorrectly", "I am swimming\n", outContent.toString());
    }

    /**
     * Test case for caterpillar
     */
    @Test
    public void testCaterpillar() {
        Butterfly caterpillar = new Butterfly();
        caterpillar.performFly();
        assertEquals("caterpillar flying incorrectly", "Oops cannot fly yet. Wait for me to be a beautiful butterfly!\n", outContent.toString());
    }

    /**
     * Test case for adult butterfly after Metamorphosis from caterpillar
     */
    @Test
    public void testAdultButterflyAfterMetamorphosis() {
        Butterfly butterfly = new Butterfly();
        butterfly.metamorphose();
        butterfly.performFly();
        assertEquals("adult butterfly flying incorrectly", "Flyyyy. I am a beautiful butterfly!\n", outContent.toString());
    }

    /**
     * Test case for internationalize rooster
     */
    @Test
    public void testInternationalizeRooster() {
        Locale.setDefault(new Locale("ja", "JP"));
        ResourceBundle bundle = ResourceBundle.getBundle("hunghx.singtel.properties.internationalization.MessageBundle");
        Bird japaneseRooster = new Rooster(new CockADoodleDoo(bundle.getString("speak")));
        japaneseRooster.performSing();
        assertEquals("Rooster speaking incorrectly", "ko-ke-kok-ko-o\n", outContent.toString());
    }
}
