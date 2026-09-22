package com.AdvancedJava.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * StreamsAndOptionalDemo demonstrates Stream API processing and Optional container:
 * Streams Operations:
 * - filter, map, sorted, distinct, limit, skip, reduce, collect, forEach
 * Optional Operations:
 * - ofNullable, isPresent, ifPresent, orElse, orElseGet, map, filter
 */
public class StreamsAndOptionalDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 9, 1, 6, 4, 10, 3);

        System.out.println("Original numbers: " + numbers);

        // Stream Pipeline Demonstration
        List<Integer> processedList = numbers.stream()
                .filter(n -> n % 2 == 0)      // Filter even numbers: 2, 8, 2, 6, 4, 10
                .distinct()                    // Remove duplicates: 2, 8, 6, 4, 10
                .map(n -> n * 10)              // Transform by multiplying 10: 20, 80, 60, 40, 100
                .sorted()                      // Sort ascending: 20, 40, 60, 80, 100
                .skip(1)                       // Skip first 1 element: 40, 60, 80, 100
                .limit(3)                      // Take next 3 elements: 40, 60, 80
                .collect(Collectors.toList()); // Collect result into List

        System.out.println("Processed Stream Result (filter->distinct->map->sorted->skip->limit): " + processedList);

        // Stream Reduction (sum)
        int sum = processedList.stream()
                .reduce(0, (acc, n) -> acc + n); // 40 + 60 + 80 = 180
        System.out.println("Reduced Sum: " + sum);

        // Stream forEach
        System.out.print("Stream forEach output: ");
        processedList.stream().forEach(val -> System.out.print(val + " "));
        System.out.println();

        // Optional API Demo
        System.out.println("\n--- Optional API Demonstration ---");
        Optional<String> optionalName = Optional.ofNullable("Java Stream");
        Optional<String> emptyOptional = Optional.ofNullable(null);

        // 1. isPresent and ifPresent
        optionalName.ifPresent(name -> System.out.println("Optional holds value: " + name));

        // 2. orElse and orElseGet
        String fallback = emptyOptional.orElse("Default Fallback String");
        System.out.println("emptyOptional.orElse(): " + fallback);

        String lazyFallback = emptyOptional.orElseGet(() -> "Lazy Default Value");
        System.out.println("emptyOptional.orElseGet(): " + lazyFallback);

        // 3. Optional map and filter
        Optional<Integer> nameLength = optionalName
                .filter(name -> name.startsWith("Java"))
                .map(String::length);
        System.out.println("Filtered & Mapped Optional Length: " + nameLength.orElse(0));
    }
}
