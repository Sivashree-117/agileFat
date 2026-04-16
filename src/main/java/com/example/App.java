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
package com.example;

public class App {

    public static String calculateGrade(int marks) {

        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        int marks = 85;
        String grade = calculateGrade(marks);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
