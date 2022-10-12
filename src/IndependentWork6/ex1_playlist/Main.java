package IndependentWork6.ex1_playlist;

public class Main {
    public static void main(String[] args) {
        Playlist p = new Playlist("A minha playlist");

        Music m1 = new Music("ABC", 300);
        Music m2 = new Music("DEF", 250);
        Music m3 = new Music("GHI", 120);


        //b. acrescentar ou retirar músicas à playlist
        p.addMusic(m1);
        p.addMusic(m2);
        p.addMusic(m3);

        //a. mostrar a lista de músicas atualmente na playlist
        p.showMusics();

        //c. calcular a duração total de todas as músicas contidas na playlist.
        p.duracaoTotalMusicas();
    }
}
