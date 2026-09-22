package com.AdvancedJava.Enums;

/**
 * EnumBasicsDemo demonstrates type-safe enumerations in Java:
 * - Special class type representing a fixed set of constants.
 * - Enums can have fields, constructors, and methods.
 * - Built-in methods: values(), valueOf(), ordinal(), name().
 * - Enums work seamlessly in switch statements.
 */

enum Priority {
    LOW(1, "Low Priority"),
    MEDIUM(2, "Medium Priority"),
    HIGH(3, "High Priority"),
    URGENT(4, "Urgent Priority");

    private final int level;
    private final String description;

    // Enum constructor (always private or package-private)
    Priority(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumBasicsDemo {

    public static void main(String[] args) {
        Priority p = Priority.HIGH;

        System.out.println("Selected Priority: " + p.name() + " (Ordinal: " + p.ordinal() + ")");
        System.out.println("Level: " + p.getLevel() + ", Description: " + p.getDescription());

        // Switch with Enum
        System.out.print("Action: ");
        switch (p) {
            case LOW:
            case MEDIUM:
                System.out.println("Handle within standard SLA.");
                break;
            case HIGH:
                System.out.println("Escalate to team lead.");
                break;
            case URGENT:
                System.out.println("Page on-call engineer immediately!");
                break;
        }

        // Iterating all Enum values
        System.out.println("\nAll Priority Levels:");
        for (Priority prio : Priority.values()) {
            System.out.println("- " + prio + " [Level " + prio.getLevel() + "]");
        }
    }
}
