package com.OOP.Constructors;

/**
 * ConstructorChaining demonstrates delegating constructor calls within the same class using this().
 * Rules:
 * - this(...) must be the VERY FIRST statement inside the constructor body.
 * - Prevents code duplication during initialization.
 */

class Employee {
    private int empId;
    private String name;
    private String department;
    private double salary;

    // Constructor 1: Default fallback
    public Employee() {
        this(0, "Unassigned"); // Calls Constructor 2
    }

    // Constructor 2: ID and Name
    public Employee(int empId, String name) {
        this(empId, name, "General", 30000.0); // Calls Constructor 3
    }

    // Constructor 3: Master constructor initializing all fields
    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        System.out.println("Master constructor executed for ID: " + empId);
    }

    public void printEmployee() {
        System.out.println("Employee [ID: " + empId + ", Name: " + name + 
                           ", Dept: " + department + ", Salary: $" + salary + "]");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("Creating e1 via default constructor:");
        Employee e1 = new Employee();
        e1.printEmployee();

        System.out.println("\nCreating e2 via ID and Name constructor:");
        Employee e2 = new Employee(102, "Alice");
        e2.printEmployee();
    }
}
