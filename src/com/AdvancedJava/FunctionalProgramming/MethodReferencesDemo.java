package com.AdvancedJava.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * MethodReferencesDemo demonstrates shorthand syntax for lambdas calling existing methods (Class::method):
 * 1. Static Method Reference: Class::staticMethod
 * 2. Instance Method Reference of specific object: instance::instanceMethod
 * 3. Instance Method Reference of arbitrary object of a type: Class::instanceMethod
 * 4. Constructor Reference: Class::new
 */

class User {
    private String name;

    public User() {
        this.name = "Guest";
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class MethodReferencesDemo {

    public static void printMessage(String msg) {
        System.out.println("Static message: " + msg);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 1. Static Method Reference (Math::abs)
        Function<Integer, Integer> absFunc = Math::abs;
        System.out.println("Math::abs(-50): " + absFunc.apply(-50));

        // 2. Instance Method Reference of a specific object (System.out::println)
        names.forEach(System.out::println);

        // 3. Instance Method Reference of an arbitrary object (String::toUpperCase)
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Upper names: " + upperNames);

        // 4. Constructor Reference (User::new)
        Supplier<User> defaultUserSupplier = User::new;
        User guest = defaultUserSupplier.get();

        Function<String, User> namedUserFunction = User::new;
        User admin = namedUserFunction.apply("AdminUser");

        System.out.println("Guest name: " + guest.getName() + ", Admin name: " + admin.getName());
    }
}
