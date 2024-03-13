package de.wwi23ama.vl_2024_03_15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlaceholderTest {
    @Test
    public void testPlaceholder() {
        assertEquals("Remove me!", Placeholder.placeholder());
    }
}
