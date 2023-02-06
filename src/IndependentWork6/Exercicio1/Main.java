package IndependentWork6.Exercicio1;

public class Main {

    public static void main(String[] args) {

        Playlist p = new Playlist("A minha playlist");

        Musica m1 = new Musica("Musica 1", 240);
        Musica m2 = new Musica("Musica 2", 200);
        Musica m3 = new Musica("Musica 3", 170);

        p.acrescentarMusica(m1);
        p.acrescentarMusica(m2);
        p.acrescentarMusica(m3);

        System.out.println(p.calcularDuracaoTotal());

        p.removerMusica(m1);

        System.out.println(p.calcularDuracaoTotal());

        p.mostrarMusicas();

    }

}
