package com.JavaFundamentals.ControlFlow;

/**
 * SwitchStatements demonstrates classic switch-case-break and modern Switch Expressions (Java 14+).
 * Supported types: byte, short, char, int, String, Enum, and wrapper types.
 */
public class SwitchStatements {

    public static void main(String[] args) {
        // Classic Switch Statement
        System.out.println("--- Classic Switch ---");
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);

        // Classic Switch demonstration
        System.out.println("\n--- Switch Statement Demonstration ---");
        String dayType;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Unknown";
                break;
        }
        System.out.println("Day " + day + " is a " + dayType);
    }
}
