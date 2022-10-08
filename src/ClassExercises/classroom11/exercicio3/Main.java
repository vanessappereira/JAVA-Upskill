package Aula11.exercicio3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Filme[] filmes = new Filme[4];
        filmes[0] = new Filme(8, "Force Awakens", 2015);
        filmes[1] = new Filme(9, "Star Wars", 1977);
        filmes[2] = new Filme(7, "Empire Strikes Back", 1980);
        filmes[3] = new Filme(10, "Return of the Jedi", 1983);

        for(int i =0; i<filmes.length; i++){
            System.out.println(filmes[i]);
        }

        System.out.println("-------------------");

        Arrays.sort(filmes);

        for(int i =0; i<filmes.length; i++){
            System.out.println(filmes[i]);
        }

    }
}
