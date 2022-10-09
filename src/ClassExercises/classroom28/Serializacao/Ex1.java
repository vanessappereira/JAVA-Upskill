package ClassExercises.classroom28.Serializacao;

import java.io.*;
import java.util.Scanner;

public class Ex1 implements Serializable {
    private String nome;
    private String titulo;

    public Ex1(String nome, String titulo) throws IOException {
        this.nome = nome;
        this.titulo = titulo;

    }

    FileOutputStream fileOut = new FileOutputStream("Salvamento.dat");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);



    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor insira o n 1 para salvar dados, ou 2 para carregar dados.");
        String selecao = s.nextLine();
        if (selecao == "1") { // se o nr escolhido for 1
            PrintWriter fileWriter = new PrintWriter("Salvamento.txt");
            fileWriter.println("Coloque o nome");
            String nome = s.nextLine();
            fileWriter.println("Coloque o titulo");
            String titulo = s.nextLine();
            fileWriter.close();

        } else { //carregar dados
        }
    }
}
