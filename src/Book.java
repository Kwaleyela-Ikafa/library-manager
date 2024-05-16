import enums.Genre;
import interfaces.LibraryItem;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private Genre genre;
    private boolean available;

    public Book(String title, String author, Genre genre) {
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        this.available = true;
    }

    // Setters
    public void setAuthor(String author) {
        if (author.isBlank() || author.isEmpty()) {
            throw new IllegalArgumentException("Author Cannot be null or blank");
        }
        this.author = author;
    }

    public void setTitle(String title) {
        if (title.isBlank() || title.isEmpty()) {
            throw new IllegalArgumentException("Title Cannot be null or blank");
        }
        this.title = title;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public void checkOut() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' checked out successfully.");
        } else {
            System.out.println("Book '" + title + "' is not available for checkout.");
        }
    }

    @Override
    public void checkIn() {
        if (!available) {
            available = true;
            System.out.println("Book '" + title + "' checked in successfully.");
        } else {
            System.out.println("Book '" + title + "' is already checked in.");
        }
    }
}
