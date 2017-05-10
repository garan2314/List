package s10171744d.list;

/**
 * Created by Lewis on 9/5/2017.
 */

public class Song {
    private String Artist;
    private String Title;
    private String Length;

    public Song(String artist, String title, String length) {
        Artist = artist;
        Title = title;
        Length = length;
    }

    public String getArtist() {
        return Artist;
    }

    public String getTitle() {
        return Title;
    }

    public String getLength() {
        return Length;
    }
}
