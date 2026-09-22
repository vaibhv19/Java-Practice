package com.AdvancedJava.FunctionalProgramming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * FunctionalInterfacesAndLambdas demonstrates:
 * 1. Lambda Expressions: concise inline implementation of functional interfaces ((args) -> body).
 * 2. Built-in java.util.function Interfaces:
 *    - Predicate<T>: test(T t) -> boolean
 *    - Consumer<T>: accept(T t) -> void
 *    - Supplier<T>: get() -> T
 *    - Function<T, R>: apply(T t) -> R
 * 3. Custom @FunctionalInterface
 */

// Custom Functional Interface
@FunctionalInterface
interface StringTransformer {
    String transform(String input);
}

public class FunctionalInterfacesAndLambdas {

    public static void main(String[] args) {
        // 1. Predicate<T> (Evaluates condition)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even?  " + isEven.test(7));

        // 2. Consumer<T> (Accepts argument, produces no return)
        Consumer<String> printer = message -> System.out.println("Consumer output: " + message);
        printer.accept("Hello Lambda!");

        // 3. Supplier<T> (Takes no arguments, supplies value)
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Supplier generated random number: " + randomSupplier.get());

        // 4. Function<T, R> (Takes input T, transforms into output R)
        Function<String, Integer> stringLengthCalculator = str -> str.length();
        System.out.println("Length of 'Functional': " + stringLengthCalculator.apply("Functional"));

        // 5. Custom Functional Interface
        StringTransformer upperAndExclaim = str -> str.toUpperCase() + "!!!";
        System.out.println("Transformed string: " + upperAndExclaim.transform("java lambdas"));
    }
}
