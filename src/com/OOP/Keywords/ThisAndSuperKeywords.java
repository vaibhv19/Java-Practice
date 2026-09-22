package com.OOP.Keywords;

/**
 * ThisAndSuperKeywords demonstrates:
 * - 'this': refers to current class instance fields/methods.
 * - 'super': refers to immediate parent class fields/methods/constructors.
 */

class Parent {
    String name = "Parent Field";

    public Parent() {
        System.out.println("Parent default constructor");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent parameterized constructor: " + name);
    }

    public void showMessage() {
        System.out.println("Parent showMessage()");
    }
}

class Child extends Parent {
    String name = "Child Field"; // Field shadowing

    public Child() {
        super("Base Parent"); // Invokes parent constructor
        System.out.println("Child default constructor");
    }

    public void displayNames() {
        System.out.println("Current class field (this.name):   " + this.name);
        System.out.println("Parent class field (super.name):   " + super.name);
    }

    @Override
    public void showMessage() {
        super.showMessage(); // Invokes parent method implementation
        System.out.println("Child overridden showMessage()");
    }
}

public class ThisAndSuperKeywords {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println();
        child.displayNames();
        System.out.println();
        child.showMessage();
    }
}
