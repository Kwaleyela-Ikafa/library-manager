import enums.Genre;
import interfaces.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the library.");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' removed from the library.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in the library.");
        }
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookByAuthor(String author) {
        for(Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void checkInBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                if(!book.isAvailable()) { // Check if the book is not already available
                    book.setAvailable(true); // Set the book as available
                    System.out.println("Book '" + title + "' has been checked in successfully.");
                } else {
                    System.out.println("Book '" + title + "' is already checked in.");
                    return;
                }
            }
        }
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                if(book.isAvailable()) { // Check if the book is already available
                    book.setAvailable(false); // Set the book as not available
                    System.out.println("Book '" + title + "' has been checked Out successfully.");
                } else {
                    System.out.println("Book '" + title + "' is already checked Out.");
                    return;
                }
            }
        }
    }
}
