package de.wwi23ama.vl_2024_03_22;

import java.util.List;

public class InsertionSort {
    public static void sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            moveLeft(list, i);
        }
    }

    private static void moveLeft(List<Integer> list, int i) {
        int j = i;
        while (j > 0 && list.get(j) < list.get(j - 1)) {
            swap(list, j, j - 1);
            j--;
        }
    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
