import enums.Genre;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", Genre.FICTION));

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Display Available Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author of the book: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre of the book: ");
                    Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());
                    library.addBook(new Book(title, author, genre));
                    break;
                case 2:
                    System.out.print("Enter title of the book to remove: ");
                    String removeTitle = scanner.nextLine();
                    Book removeBook = library.searchBookByTitle(removeTitle);
                    if (removeBook != null) {
                        library.removeBook(removeBook);
                    } else {
                        System.out.println("Book '" + removeTitle + "' not found in the library.");
                    }
                    break;
                case 3:
                    System.out.print("Enter title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    Book searchBook = library.searchBookByTitle(searchTitle);
                    if (searchBook != null) {
                        System.out.println("Book found: " + searchBook.getTitle() + " by " + searchBook.getAuthor());
                    } else {
                        System.out.println("Book '" + searchTitle + "' not found in the library.");
                    }
                    break;
                case 4:
                    System.out.print("Enter author of the book to search: ");
                    String searchAuthor = scanner.nextLine();
                    Book searchBookAuthor = library.searchBookByAuthor(searchAuthor);
                    if (searchBookAuthor != null) {
                        System.out.println("Book found: " + searchBookAuthor.getTitle() + " by " + searchBookAuthor.getAuthor());
                    } else {
                        System.out.println("Book '" + searchAuthor + "' not found in the library.");
                    }
                    break;
                case 5:
                    library.displayAvailableBooks();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
