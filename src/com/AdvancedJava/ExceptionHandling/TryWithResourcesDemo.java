package com.AdvancedJava.ExceptionHandling;

/**
 * TryWithResourcesDemo demonstrates automatic resource management introduced in Java 7.
 * Any class implementing AutoCloseable or java.io.Closeable can be managed in try-with-resources.
 * Guarantees close() method execution even if exceptions occur, eliminating manual finally resource closes.
 */

class CustomDatabaseConnection implements AutoCloseable {
    public CustomDatabaseConnection() {
        System.out.println("Database connection OPENED.");
    }

    public void executeQuery(String sql) {
        System.out.println("Executing SQL query: " + sql);
    }

    @Override
    public void close() {
        System.out.println("Database connection CLOSED automatically via AutoCloseable.");
    }
}

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        System.out.println("--- Try-With-Resources Execution ---");
        try (CustomDatabaseConnection db = new CustomDatabaseConnection()) {
            db.executeQuery("SELECT * FROM users;");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("After try block completes.");
    }
}
