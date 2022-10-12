package IndependentWork6.ex1_playlist;

public class Playlist {
    //Creation of a name for the playlist
    private String name;
    //Get music array
    private Music[] music;

    //Create constructor
    public Playlist(String name) {
        this.name = name;
    }

    //ex1_a mostrar a lista de músicas atualmente na playlist
    public void showMusics() {
        for (int i = 0; i < music.length; i++) {
            if (music[i] != null) {
                System.out.println(music[i]);
            }
        }
    }

    //ex1_b acrescentar ou retirar músicas à playlist
    private static Music[] addM(Music[] v1, Music[] v2) {

        Music[] add = new Music[v1.length + v2.length];

        for (int z = 0; z < v1.length; z++) {
            add[z] = v1[z];
        }
        for (int z = 0; z < v2.length; z++) {
            add[v1.length + z] = v2[z];
        }
        return add;
    }

    public void addMusic(Music music1) {
        Music[] nova = new Music[1];
        nova[0] = music1;
        music = addM(music, nova);         //merge entre a lista e a musica a adicionar

    }

    public void removeMusic(Music music1) {
        for (int i = 0; i < music.length; i++) {    //percorrer a lista e caso se verifique, remove se a musica
            if (music[i] == music1) {
                music[i] = null;
            }
        }
    }

    //ex1_c calcular a duração total de todas as músicas contidas na playlist.
    public int duracaoTotalMusicas() {
        //Inicialização das variáveis
        int sum = 0;
        for (int i = 0; i < music.length; i++) {        //percorrer a lista das musicas
            if (music[i] != null) {
                sum = sum + music[i].getDuration();
            }
        }
        return sum;
    }
}
