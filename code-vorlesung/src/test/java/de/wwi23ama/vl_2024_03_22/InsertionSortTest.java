package de.wwi23ama.vl_2024_03_22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortTest {
    @Test
    public void testInsertionSort() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        InsertionSort.sort(list);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
        assertEquals(5, list.get(4));
    }
}
