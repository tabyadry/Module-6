package exercises.library;

public class Book extends Media {
    private String edition;

    public Book(String name, String edition) {
        super(name);
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }
}
