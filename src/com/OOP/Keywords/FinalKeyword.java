package com.OOP.Keywords;

/**
 * FinalKeyword demonstrates three applications of the 'final' modifier:
 * 1. final variable: constant value, cannot be reassigned.
 * 2. final method: cannot be overridden by subclasses.
 * 3. final class: cannot be extended (prevents inheritance).
 */

// final class cannot be extended
final class ImmutableConfig {
    public static final String API_KEY = "SECRET_KEY_12345";
}

class BaseClass {
    // final method cannot be overridden
    public final void printSecurityHeader() {
        System.out.println("--- Security Verified Header ---");
    }
}

class SubClass extends BaseClass {
    // Attempting to override printSecurityHeader() will cause a compilation error!
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int MAX_LIMIT = 500;
        // MAX_LIMIT = 600; // Compile error: cannot reassign final variable

        System.out.println("Final variable MAX_LIMIT: " + MAX_LIMIT);
        System.out.println("Final class constant API_KEY: " + ImmutableConfig.API_KEY);

        SubClass obj = new SubClass();
        obj.printSecurityHeader();
    }
}
