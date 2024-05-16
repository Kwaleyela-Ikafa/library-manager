import enums.Genre;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Library library = new Library();

        // Add some books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", Genre.FICTION));

//        // Display all available books
//        library.displayAvailableBooks();
//
//        // Search for a book
//        library.searchBookByTitle("The Great Gatsby");
//
//        // Check out a book
//        library.checkOutBook("To Kill a Mockingbird");
//
//        // Display all available books after checking out
//        library.displayAvailableBooks();
//
//        // Check in a book
//        library.checkInBook("To Kill a Mockingbird");
    }
}