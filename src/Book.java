import interfaces.LibraryItem;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private String genre;
    private String availability;

    public Book(String title, String author, String genre, String availability) {
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setAvailability(availability);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public void checkOut() {

    }

    @Override
    public void checkIn() {

    }
}
