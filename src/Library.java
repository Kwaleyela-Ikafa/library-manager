import enums.Genre;
import interfaces.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book searchBookByTitle(String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookByAuthor(String author) {
        for(Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(author) && !book.isAvailable()) {
                return book;
            }
        }
        return null;
    }

    public List<Book> displayAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for(Book book : books) {
            if(book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
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
