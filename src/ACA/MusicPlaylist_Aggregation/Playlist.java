package ACA.MusicPlaylist_Aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Playlist {
    private List<Song> song = new ArrayList<>();

    public void addSongs(Song songs){
        this.song.add(songs);
    }

    public void removeSong(Song song) {
        if(Objects.nonNull(song)) {
            this.song.remove(song);
            System.out.println(song.getTitle() + " is removed");
        } else {
            System.out.println("select song to remove");
        }
    }


    public void play(Song song) {
        if (song != null && this.song.contains(song)) {
            System.out.println(song.getTitle() + " by " + song.getArtist() + " is playing.");
        } else {
            System.out.println("Song is not recognized");
        }
    }

    public List<Song> getSong(){
        return this.song;
    }
}
