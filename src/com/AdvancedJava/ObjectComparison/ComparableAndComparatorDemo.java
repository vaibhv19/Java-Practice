package com.AdvancedJava.ObjectComparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ComparableAndComparatorDemo demonstrates custom object sorting:
 * 1. Comparable (Natural Order): Class implements Comparable<T> and overrides compareTo(T o).
 * 2. Comparator (Custom External Order): Separate Comparator instance overriding compare(T o1, T o2).
 */

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    // Natural Sorting by ID
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " (GPA: " + gpa + ")";
    }
}

public class ComparableAndComparatorDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Charlie", 3.5));
        students.add(new Student(101, "Alice", 3.9));
        students.add(new Student(102, "Bob", 3.7));

        // 1. Natural Sort via Comparable (by ID)
        Collections.sort(students);
        System.out.println("Sorted by Natural Order (ID via Comparable):");
        students.forEach(System.out::println);

        // 2. Custom Sort via Comparator (by GPA descending)
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("\nSorted by GPA Descending (via Comparator):");
        students.forEach(System.out::println);

        // 3. Custom Sort via Name (Lambda Comparator)
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("\nSorted by Name Alphabetically (via Lambda Comparator):");
        students.forEach(System.out::println);
    }
}
