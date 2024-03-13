package de.wwi23ama.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class GreetTest {
    @Test
    public void testGreet() {
        assertEquals("Hello World!", Greet.greet());
    }
}
