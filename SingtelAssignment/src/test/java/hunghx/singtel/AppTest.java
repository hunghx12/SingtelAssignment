package hunghx.singtel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hunghx.singtel.Models.Bird;

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
        Bird bird = new Bird();

        bird.walk();
        assertEquals("I am walking\n", outContent.toString());
    }

    /**
     * Test case for bird flying
     */
    @Test
    public void testBirdFlying() {
        Bird bird = new Bird();

        bird.fly();
        assertEquals("I am flying\n", outContent.toString());
    }

    /**
     * Test case for bird singing
     */
    @Test
    public void testBirdSinging() {
        Bird bird = new Bird();

        bird.sing();
        assertEquals("I am singing\n", outContent.toString());
    }
}
