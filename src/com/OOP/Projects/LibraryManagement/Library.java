package com.OOP.Projects.LibraryManagement;

import java.util.HashMap;
import java.util.Map;

/**
 * Educational Library Project - Library Service Controller
 */
public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Member> members = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void checkoutBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);

        if (member == null) {
            System.out.println("Member ID not found.");
            return;
        }
        if (book == null) {
            System.out.println("Book ISBN not found.");
            return;
        }
        if (book.isBorrowed()) {
            System.out.println("Book '" + book.getTitle() + "' is already borrowed.");
            return;
        }

        member.borrowBook(book);
        System.out.println("Book '" + book.getTitle() + "' checked out to " + member.getName());
    }

    public void returnBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);

        if (member != null && book != null && book.isBorrowed()) {
            member.returnBook(book);
            System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());
        }
    }

    public void displayBooks() {
        System.out.println("\n--- Library Catalog ---");
        for (Book b : books.values()) {
            System.out.println(b);
        }
    }
}
