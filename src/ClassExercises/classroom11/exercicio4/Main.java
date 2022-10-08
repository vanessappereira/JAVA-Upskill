package Aula11.exercicio4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Livro[] livros = new Livro[5];

        livros[0] = new Livro("The Shinning", 1990, "Leya", "Stephen King");
        livros[1] = new Livro("Harry Potter e a Pedra Filosofal", 2001, "ASA", "Joanne Rowling");
        livros[2] = new Livro("O Inferno de Dante", 1472, "Bertrand", "Dante");
        livros[3] = new Livro("Conde de Monte Cristo", 1844, "Texto", "Alexandre Dumas");
        livros[4] = new Livro("Desenhar Bases de Dados", 2016, "Silabo", "Pedro Nogueira");
        for(int i = 0; i<livros.length; i++){
            System.out.println(livros[i]);
        }

        System.out.println("--------");
        Arrays.sort(livros, new NomeComparator());
        for(int i = 0; i<livros.length; i++){
            System.out.println(livros[i]);
        }

        System.out.println("--------");
        Arrays.sort(livros, new AnoCompare());
        for(int i = 0; i<livros.length; i++){
            System.out.println(livros[i]);
        }

        System.out.println("--------");
        Arrays.sort(livros, new EditoraCompare());
        for(int i = 0; i<livros.length; i++){
            System.out.println(livros[i]);
        }

    }
}
