# Library Book Management System

A Java-based console application designed to manage a library's book inventory. This project demonstrates the practical application of the **Java Collections Framework**, specifically focusing on the `ArrayList` for dynamic data handling.

## Problem Definition
Traditional arrays in Java have a fixed size. For a library where books are constantly being added or removed, a fixed-size array is inefficient. This project solves that problem by implementing an `ArrayList` to handle dynamic resizing and easy data manipulation.

## Key Features
- **Add New Books**: Instantly expand the collection without worrying about array limits.
- **Remove Issued Books**: Seamlessly delete entries by title using Java 8 predicates.
- **Search Functionality**: Quickly find books by title (case-insensitive).
- **Display Inventory**: Lists all current books in a clean, formatted table-like view.

## Technical Concepts Used
- **`ArrayList`**: Utilized for its dynamic resizing capabilities.
- **Object-Oriented Programming (OOP)**: Encapsulation used in the `Book` class.
- **Enhanced For-Loops**: For efficient iteration through the collection.
- **Lambda Expressions**: Used in `removeIf` for concise data handling.


## CODE:
import java.util.ArrayList;
import java.util.Scanner;

// Book class to represent the data structure
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    
    @Override
    public String toString() {
        return String.format("Title: %-20s | Author: %s", title, author);
    }
}

public class LibrarySystem {
    private static ArrayList<Book> library = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book (Issued)");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> searchBook();
                case 4 -> displayBooks();
                case 5 -> {
                    System.out.println("Exiting System...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        library.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    private static void removeBook() {
        System.out.print("Enter Title of book to remove: ");
        String title = scanner.nextLine();
        boolean removed = library.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        
        if (removed) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void searchBook() {
        System.out.print("Enter Title to search: ");
        String title = scanner.nextLine();
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                return;
            }
        }
        System.out.println("Book not found in collection.");
    }

    private static void displayBooks() {
        if (library.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            System.out.println("\n--- Current Collection ---");
            library.forEach(System.out::println);
        }
    }
}