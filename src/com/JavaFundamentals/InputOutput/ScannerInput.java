package com.JavaFundamentals.InputOutput;

import java.util.Scanner;

/**
 * ScannerInput demonstrates console input parsing using java.util.Scanner.
 * Shows solution to the common Scanner pitfall:
 * Calling nextLine() immediately after nextInt() / nextDouble() leaves a leftover newline '\\n' in the buffer.
 */
public class ScannerInput {

    public static void main(String[] args) {
        // Simulated input parsing demonstration
        String inputData = "42\nJohn Doe\n3.95\n";
        Scanner scanner = new Scanner(inputData);

        System.out.println("Reading integer using nextInt()...");
        int age = scanner.nextInt();
        
        // FIX for Scanner Pitfall: Consume the remaining newline character before calling nextLine()
        scanner.nextLine();

        System.out.println("Reading full name line using nextLine()...");
        String fullName = scanner.nextLine();

        System.out.println("Reading double using nextDouble()...");
        double score = scanner.nextDouble();

        System.out.println("\nParsed Values:");
        System.out.println("Age: " + age);
        System.out.println("Full Name: " + fullName);
        System.out.println("Score: " + score);

        scanner.close();
    }
}
