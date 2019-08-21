package exercises.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Media> mediaList = new ArrayList<Media>();

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public ArrayList<Media> getMediaList() {
        return new ArrayList<Media>(mediaList);
    }
}
