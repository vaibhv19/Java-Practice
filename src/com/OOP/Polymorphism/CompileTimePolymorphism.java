package com.OOP.Polymorphism;

/**
 * CompileTimePolymorphism demonstrates static binding / method overloading.
 * The method to be executed is resolved at compile time based on method signatures.
 */
public class CompileTimePolymorphism {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism demo = new CompileTimePolymorphism();
        System.out.println("add(5, 10): " + demo.add(5, 10));
        System.out.println("add(5, 10, 15): " + demo.add(5, 10, 15));
        System.out.println("add(3.5, 2.5): " + demo.add(3.5, 2.5));
    }
}
