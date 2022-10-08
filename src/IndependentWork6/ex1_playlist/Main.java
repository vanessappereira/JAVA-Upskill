package IndependentWork6.ex1_playlist;

public class Main {
    public static void main(String[] args) {
        playlist p = new playlist("A minha playlist");

        music m1 = new music("ABC", 300);
        music m2 = new music("DEF", 250);
        music m3 = new music("GHI", 120);


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
