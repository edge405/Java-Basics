package ACA.MusicPlaylist_Aggregation;

public class Song {
    private String title, artist, duration;

    public Song(String title, String artist, String duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration(){
        return duration;
    }

}
