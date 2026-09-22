package com.OOP.AdvancedOOP;

/**
 * InnerAndNestedClasses demonstrates:
 * 1. Static Nested Class: static class defined inside outer class.
 * 2. Member Inner Class: non-static class requiring outer class instance.
 * 3. Local Inner Class: defined inside a method body.
 * 4. Anonymous Inner Class: one-off implementation of interface/class.
 */

interface GreetingService {
    void greet(String name);
}

public class InnerAndNestedClasses {

    private String outerMessage = "Outer Instance Message";
    private static String outerStaticMessage = "Outer Static Message";

    // 1. Static Nested Class
    public static class StaticNestedClass {
        public void print() {
            System.out.println("StaticNestedClass accessing: " + outerStaticMessage);
        }
    }

    // 2. Member Inner Class
    public class InnerClass {
        public void print() {
            System.out.println("Member InnerClass accessing outer instance: " + outerMessage);
        }
    }

    public void demonstrateLocalAndAnonymous() {
        // 3. Local Inner Class
        class LocalInnerClass {
            public void display() {
                System.out.println("LocalInnerClass executed inside method.");
            }
        }
        LocalInnerClass localObj = new LocalInnerClass();
        localObj.display();

        // 4. Anonymous Inner Class
        GreetingService service = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Anonymous Inner Class greeting: Hello " + name);
            }
        };
        service.greet("Bob");
    }

    public static void main(String[] args) {
        // Instantiating static nested class
        InnerAndNestedClasses.StaticNestedClass staticObj = new InnerAndNestedClasses.StaticNestedClass();
        staticObj.print();

        // Instantiating member inner class (requires outer instance)
        InnerAndNestedClasses outer = new InnerAndNestedClasses();
        InnerAndNestedClasses.InnerClass innerObj = outer.new InnerClass();
        innerObj.print();

        outer.demonstrateLocalAndAnonymous();
    }
}
