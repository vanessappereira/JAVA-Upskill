package IndependentWork6.Exercicio1;

public class Playlist {

    private String nome;
    private Musica[] musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new Musica[0];
    }

    public void mostrarMusicas() {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                System.out.println(musicas[i]);
            }
        }
    }

    public void acrescentarMusica(Musica m) {
        Musica[] novo = new Musica[1];
        novo[0] = m;
        musicas = merge(musicas, novo);
    }

    public void removerMusica(Musica m) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == m) {
                musicas[i] = null;
            }
        }
    }

    public int calcularDuracaoTotal() {
        int soma = 0;
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                soma += musicas[i].getDuracao();
            }
        }
        return soma;
    }

    private static Musica[] merge(Musica[] v1, Musica[] v2) {
        Musica[] novo = new Musica[v1.length + v2.length];
        for (int i = 0; i < v1.length; i++) {
            novo[i] = v1[i];
        }
        for (int i = 0; i < v2.length; i++) {
            novo[v1.length + i] = v2[i];
        }
        return novo;
    }

}
