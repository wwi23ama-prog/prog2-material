package de.wwi23ama.vl_2024_03_22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ComplexTest {
    @Test
    public void testComplex() {
        Complex c = new Complex(1, 2);
        assertEquals("1.0 + 2.0i", c.String());

        Complex c2 = new Complex(3, 4);
        assertEquals("3.0 + 4.0i", c2.String());
    }
}
