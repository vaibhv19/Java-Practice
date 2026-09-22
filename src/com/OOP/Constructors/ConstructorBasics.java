package com.OOP.Constructors;

/**
 * ConstructorBasics demonstrates:
 * - Default constructor (automatically provided if no constructors are declared)
 * - No-arg explicit constructor
 * - Parameterized constructor
 */

class Student {
    private String name;
    private int id;

    // No-arg Constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        System.out.println("No-arg constructor invoked.");
    }

    // Parameterized Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Parameterized constructor invoked for: " + name);
    }

    public void display() {
        System.out.println("Student [ID: " + id + ", Name: " + name + "]");
    }
}

public class ConstructorBasics {
    public static void main(String[] args) {
        Student s1 = new Student(); // Invokes no-arg constructor
        s1.display();

        System.out.println();
        Student s2 = new Student("Bob", 101); // Invokes parameterized constructor
        s2.display();
    }
}
