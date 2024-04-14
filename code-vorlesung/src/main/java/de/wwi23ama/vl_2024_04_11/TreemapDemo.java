package de.wwi23ama.vl_2024_04_11;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {
    public static void runDemo() {
        Map<String, Integer> ages = new TreeMap<>();

        ages.put("Bob", 30);
        ages.put("Alice", 25);
        ages.put("Bene", 42);

        System.out.println(ages.get("Alice"));

        ages.put("Alice", 77);

        System.out.println(ages.get("Alice"));

        System.out.println(ages);
    }

    public static void main(String[] args) {
        runDemo();
    }
}
