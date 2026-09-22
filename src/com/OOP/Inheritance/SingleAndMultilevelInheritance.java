package com.OOP.Inheritance;

/**
 * SingleAndMultilevelInheritance demonstrates:
 * - Single Inheritance: Class B extends Class A
 * - Multilevel Inheritance: Class C extends Class B extends Class A
 * Note: Multiple inheritance of classes (Class C extends A, B) is NOT supported in Java to avoid ambiguity (Diamond Problem).
 */

// Base Class (Superclass)
class Animal {
    String category = "Living Creature";

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Single Inheritance: Mammal extends Animal
class Mammal extends Animal {
    boolean hasFur = true;

    public void breathe() {
        System.out.println("Mammal breathes oxygen.");
    }
}

// Multilevel Inheritance: Dog extends Mammal
class Dog extends Mammal {
    String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog (" + breed + ") barks: Woof Woof!");
    }
}

public class SingleAndMultilevelInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Golden Retriever");

        // Inherited from Animal superclass
        System.out.println("Category: " + myDog.category);
        myDog.eat();

        // Inherited from Mammal intermediate superclass
        System.out.println("Has fur: " + myDog.hasFur);
        myDog.breathe();

        // Specific to Dog class
        myDog.bark();
    }
}
