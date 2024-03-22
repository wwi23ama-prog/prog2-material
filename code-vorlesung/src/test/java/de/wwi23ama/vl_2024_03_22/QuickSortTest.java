package de.wwi23ama.vl_2024_03_22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {
    
    @Test
    public void testSplit() {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(55);
        list.add(2);
        list.add(42);
        list.add(1);
        list.add(4);
        list.add(38);
        QuickSort.split(list);
        assertEquals(2, list.get(0));
        assertEquals(1, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(13, list.get(3));
        assertEquals(55, list.get(4));
        assertEquals(42, list.get(5));
        assertEquals(38, list.get(6));
    }

    @Test
    public void testQuickSort() {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(55);
        list.add(2);
        list.add(42);
        list.add(1);
        list.add(4);
        list.add(38);
        QuickSort.sort(list);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(13, list.get(3));
        assertEquals(38, list.get(4));
        assertEquals(42, list.get(5));
        assertEquals(55, list.get(6));
    }
}
