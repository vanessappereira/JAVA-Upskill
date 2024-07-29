package Exercises.AWork6.playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Show musics
    public void showMusics() {
        for (Song song : songs) {
            System.out.println(song.getName());
        }
    }

    // Add musics
    public void addMusic(Song song) {
        songs.add(song);
        // inform the song added
        System.out.println("Music added: " + song.getName());
    }

    // Remove musics
    public void removeMusic(Song song) {
        songs.removeIf(s -> s.getName().equals(song.getName()));
        // inform the song deletion
        System.out.println("Music " + song.getName() + " removed from the playlist");
    }

    // Total duration
    public int getTotalDuration() {
        int totalDuration = 0;
        for (Song song : songs) {
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }
}
