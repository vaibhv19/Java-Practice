package com.AdvancedJava.ObjectComparison;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * EqualsAndHashCodeDemo demonstrates the equals() and hashCode() contract:
 * Contract Rules:
 * 1. If two objects are equal according to equals(Object), calling hashCode() on each must produce the SAME integer result.
 * 2. If two objects have the same hashCode(), they are NOT necessarily equal (Hash collision).
 * 3. Overriding equals() requires overriding hashCode() to prevent breaking Hash-based collections (HashSet, HashMap).
 */

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person[ID=" + id + ", Name=" + name + "]";
    }
}

public class EqualsAndHashCodeDemo {
    public static void main(String[] args) {
        Person p1 = new Person(101, "Alice");
        Person p2 = new Person(101, "Alice");

        System.out.println("p1 == p2: " + (p1 == p2)); // false (different references)
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true (content equality)
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());

        Set<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2); // Recognized as duplicate because equals() and hashCode() are overridden properly!

        System.out.println("HashSet size (Expected 1): " + people.size());
    }
}
