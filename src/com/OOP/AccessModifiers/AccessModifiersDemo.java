package com.OOP.AccessModifiers;

/**
 * AccessModifiersDemo demonstrates the four visibility levels in Java:
 * 1. private: Visible ONLY within the defining class.
 * 2. default (package-private): Visible within the SAME package.
 * 3. protected: Visible within the SAME package and in subclasses in OTHER packages.
 * 4. public: Visible EVERYWHERE across all packages.
 */
public class AccessModifiersDemo {

    private String privateField = "Private (Class Only)";
    String defaultField = "Default (Package Only)";
    protected String protectedField = "Protected (Package + Subclasses)";
    public String publicField = "Public (Universal Access)";

    public void testVisibilityWithinClass() {
        System.out.println("--- Inside Same Class ---");
        System.out.println(privateField);
        System.out.println(defaultField);
        System.out.println(protectedField);
        System.out.println(publicField);
    }

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        demo.testVisibilityWithinClass();
    }
}
