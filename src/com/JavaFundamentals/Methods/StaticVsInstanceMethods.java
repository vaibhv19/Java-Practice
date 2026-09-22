package com.JavaFundamentals.Methods;

/**
 * StaticVsInstanceMethods demonstrates:
 * - Static methods: belong to the class, called without creating objects.
 * - Instance methods: belong to an object instance, operate on instance state.
 */
public class StaticVsInstanceMethods {

    private String instanceData = "Instance Field State";
    private static String staticData = "Static Field State";

    // Static method
    public static void displayStaticInfo() {
        System.out.println("Static method called. Accessing: " + staticData);
        // System.out.println(instanceData); // Compile error: static method cannot directly access instance variable
    }

    // Instance method
    public void displayInstanceInfo() {
        System.out.println("Instance method called.");
        System.out.println("Instance data: " + instanceData);
        System.out.println("Static data: " + staticData); // Instance methods CAN access static variables
    }

    public static void main(String[] args) {
        // Calling static method directly via class name
        StaticVsInstanceMethods.displayStaticInfo();

        // Calling instance method requires object creation
        StaticVsInstanceMethods obj = new StaticVsInstanceMethods();
        obj.displayInstanceInfo();
    }
}
