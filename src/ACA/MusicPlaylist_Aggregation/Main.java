package ACA.MusicPlaylist_Aggregation;

import java.util.List;

public class Main {
    public static void main(String args[]){
        Song song1 = new Song("Bahay kubo", "Ejay", "1min");
        Song song2 = new Song("Dayang dayang", "Lindayao", "5min");

        Playlist playlist1 = new Playlist();
        playlist1.addSongs(song1);
        playlist1.addSongs(song2);

        List<Song> allSongs = playlist1.getSong();
        int i = 0;
        for(Song songs : allSongs){
            i++;
            System.out.format("Song %d \nTitle: %s \nArtist: %s \nDuration: %s \n", i, songs.getTitle(), songs.getArtist(), songs.getDuration());
        }


        playlist1.removeSong(song2);

        playlist1.play(song2);
    }
}
