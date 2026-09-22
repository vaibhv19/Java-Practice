package com.AdvancedJava.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReadWriteDemo demonstrates character stream file I/O:
 * - FileWriter and BufferedWriter for efficient writing
 * - FileReader and BufferedReader for line-by-line reading
 * - Managed using try-with-resources
 */
public class FileReadWriteDemo {

    public static void main(String[] args) {
        File demoFile = new File("demo_output.txt");

        // 1. Writing to file
        System.out.println("--- Writing to File ---");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(demoFile))) {
            writer.write("Hello, Core Java File Handling!");
            writer.newLine();
            writer.write("Line 2: Character stream writing with BufferedWriter.");
            writer.newLine();
            writer.write("Line 3: File I/O completed successfully.");
            System.out.println("Data written to " + demoFile.getName());
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // 2. Reading from file
        System.out.println("\n--- Reading from File ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(demoFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("READ: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Clean up
        if (demoFile.exists()) {
            demoFile.delete();
            System.out.println("\nTemp file demo_output.txt removed.");
        }
    }
}
