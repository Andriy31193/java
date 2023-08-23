package com.company.homeWorks.models;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book() {
        // Default constructor
    }

    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter title: ");
        title = scanner.nextLine();

        System.out.print("Enter author: ");
        author = scanner.nextLine();

        // Input validation for year
        while (true) {
            System.out.print("Enter year of publication: ");
            String inputYear = scanner.nextLine();
            try {
                year = Integer.parseInt(inputYear);
                if (year < 0) {
                    System.out.println("Invalid year. Please enter a valid year.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year.");
            }
        }

        System.out.print("Enter publisher: ");
        publisher = scanner.nextLine();

        System.out.print("Enter genre: ");
        genre = scanner.nextLine();

        // Input validation for page count
        while (true) {
            System.out.print("Enter page count: ");
            String inputPageCount = scanner.nextLine();
            try {
                pageCount = Integer.parseInt(inputPageCount);
                if (pageCount <= 0) {
                    System.out.println("Invalid page count. Please enter a valid value.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid page count.");
            }
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Page Count: " + pageCount);
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.inputInfo();
        System.out.println("\nBook information entered:");
        book1.displayInfo();

        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Little, Brown and Company", "Fiction", 277);
        System.out.println("\nBook information for book2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year of Publication: " + book2.getYear());
    }
}
