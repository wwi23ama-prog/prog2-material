package de.wwi23ama.vl_2024_03_22;

import java.util.List;
import java.util.ArrayList;


public class QuickSort {
    
    /** Sortiert die Liste so um, dass alle Elemente,
     *  die kleiner als das erste Element sind, links davon stehen
     *  und alle Elemente, die größer sind, rechts davon stehen.
     *  Liefert die Größe der linken Liste zurück.
     */
    public static int split(List<Integer> list) {
        if (list.size() <= 1) {
            return 0;
        }
        int pivot = list.get(0);
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }

        list.clear();
        list.addAll(left);
        list.add(pivot);
        list.addAll(right);

        return left.size();
    }

    public static void sort(List<Integer> list) {
        if (list.size() <= 1) {
            return;
        }
        int pivotPos = split(list);

        List<Integer> left = list.subList(0, pivotPos);
        List<Integer> right = list.subList(pivotPos + 1, list.size());

        sort(left);
        sort(right);
    }
}
