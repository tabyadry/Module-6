package exercises.library;

public class Video extends Media {
    private Integer duration;

    public Video(String name, Integer duration) {
        super(name);
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }
}
