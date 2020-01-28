package hunghx.singtel;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hunghx.singtel.Models.Bird;
import hunghx.singtel.Models.Chicken;
import hunghx.singtel.Models.Duck;

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
}
