package com.example;

public class LibrarySystem {
    public static void main(String[] args) {

        boolean bookAvailable = true;
        
        if (bookAvailable) {
            System.out.println("Book Issued");
            bookAvailable = false;
        } else {
            System.out.println("Book Not Available");
        }

        bookAvailable = true;
        System.out.println("Book Returned");

        System.out.println("Available Now: " + bookAvailable);
    }
}
