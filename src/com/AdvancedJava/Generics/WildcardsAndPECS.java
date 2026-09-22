package com.AdvancedJava.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * WildcardsAndPECS demonstrates wildcards and the PECS Principle:
 * Producer Extends, Consumer Super
 * - Unbounded Wildcard: List<?>
 * - Upper Bounded Wildcard (Producer): List<? extends Number> (Read-only producer)
 * - Lower Bounded Wildcard (Consumer): List<? super Integer> (Write-only consumer)
 */
public class WildcardsAndPECS {

    // PRODUCER EXTENDS: Produces data for reading -> List<? extends Number>
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue(); // Reading is safe!
        }
        // list.add(10); // Compile Error: Cannot add elements to ? extends Producer!
        return sum;
    }

    // CONSUMER SUPER: Consumes data for writing -> List<? super Integer>
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i); // Writing is safe!
        }
    }

    public static void main(String[] args) {
        // Producer Demo
        List<Integer> intList = List.of(10, 20, 30);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of Integer List: " + sumOfList(intList));
        System.out.println("Sum of Double List:  " + sumOfList(doubleList));

        // Consumer Demo
        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        System.out.println("Consumer list after adding numbers: " + numList);
    }
}
