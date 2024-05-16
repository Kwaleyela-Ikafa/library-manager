import enums.Genre;
import interfaces.LibraryItem;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private Genre genre;

    public Book(String title, String author, Genre genre) {
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
    }

    public Book(Book source) {
        setTitle(source.title);
        setAuthor(source.author);
        setGenre(source.genre);
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

//    public String getAvailability() {
//        return availability;
//    }

    @Override
    public void checkOut() {

    }

    @Override
    public void checkIn() {

    }
}
