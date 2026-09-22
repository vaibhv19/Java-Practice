package com.OOP.Inheritance;

/**
 * HierarchicalInheritance demonstrates multiple subclasses extending a single parent class:
 * Shape -> Circle
 * Shape -> Rectangle
 */

class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a " + color + " shape.");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        Rectangle r = new Rectangle("Blue", 4.0, 6.0);

        c.draw();
        System.out.println("Circle Area: " + c.calculateArea());

        System.out.println();
        r.draw();
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
