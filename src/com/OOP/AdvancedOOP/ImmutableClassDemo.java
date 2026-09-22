package com.OOP.AdvancedOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ImmutableClassDemo demonstrates building a completely immutable class:
 * 1. Declare class as 'final' (prevents subclassing).
 * 2. Make all fields 'private final'.
 * 3. Do NOT provide setter methods.
 * 4. Perform defensive copying in constructor and getter methods for mutable fields (e.g., List/Date).
 */
public final class ImmutableClassDemo {

    private final String id;
    private final String name;
    private final List<String> permissions;

    public ImmutableClassDemo(String id, String name, List<String> permissions) {
        this.id = id;
        this.name = name;
        // Defensive copy of mutable list parameter
        this.permissions = new ArrayList<>(permissions);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Defensive copy in getter method
    public List<String> getPermissions() {
        return Collections.unmodifiableList(permissions);
    }

    public static void main(String[] args) {
        List<String> rawPermissions = new ArrayList<>();
        rawPermissions.add("READ");
        rawPermissions.add("WRITE");

        ImmutableClassDemo user = new ImmutableClassDemo("USR-101", "Alice", rawPermissions);

        System.out.println("User: " + user.getName() + ", Permissions: " + user.getPermissions());

        // Attempting to mutate original passed list
        rawPermissions.add("ADMIN");
        System.out.println("After mutating original list, user permissions: " + user.getPermissions() + " (Unchanged due to defensive copy!)");
    }
}
