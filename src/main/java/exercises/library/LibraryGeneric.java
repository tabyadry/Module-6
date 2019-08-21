package exercises.library;

import java.util.ArrayList;

public class LibraryGeneric<T> {

    private ArrayList<T> mediaList = new ArrayList<T>();

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public ArrayList<T> getMediaList() {
        return new ArrayList<T>(mediaList);
    }
}
