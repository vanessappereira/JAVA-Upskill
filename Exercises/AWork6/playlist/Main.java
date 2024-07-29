package Exercises.AWork6.playlist;

public class Main {
    public static void main(String[] args) {

        // Create new playlist
        Playlist playlist = new Playlist("First Playlist");

        // Create songs
        Song s1 = new Song("Music 1", 240);
        Song s2 = new Song("Music 2", 180);
        Song s3 = new Song("Music 3", 300);

        // Add music to the playlist
        playlist.addMusic(s1);
        playlist.addMusic(s2);
        playlist.addMusic(s3);

        // Display the playlist
        playlist.showMusics();
        
        // Display the total duration
        System.out.println("Total duration: " + playlist.getTotalDuration());

        // Remove a song from the playlist
        playlist.removeMusic(s2);

        // Display the updated total duration
        System.out.println("Total duration: " + playlist.getTotalDuration());

        // Display the updated playlist
        playlist.showMusics();
    }
}
