package com.OOP.Projects.LibraryManagement;

/**
 * Educational Practice Project 2: Library Management System Runner
 */
public class LibraryProjectDemo {

    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch"));
        library.addBook(new Book("978-0596009205", "Head First Java", "Kathy Sierra"));

        // Register members
        library.registerMember(new Member("M-001", "Alice"));
        library.registerMember(new Member("M-002", "Bob"));

        System.out.println("--- Library Management System Demo ---");
        library.displayBooks();

        library.checkoutBook("M-001", "978-0134685991");
        library.displayBooks();

        library.returnBook("M-001", "978-0134685991");
        library.displayBooks();
    }
}
