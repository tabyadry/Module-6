package exercises.library;

public class Newspaper extends Media {
    private Integer noOfArticles;

    public Newspaper(String name, Integer noOfArticles) {
        super(name);
        this.noOfArticles = noOfArticles;
    }

    public Integer getNoOfArticles() {
        return noOfArticles;
    }
}
