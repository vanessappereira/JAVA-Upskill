package Aula13.Exercicio3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Descrição: ");
        String descricao = b.nextLine();
        System.out.println("Valor do movimento? ");
        int valor = b.nextInt();

        //escrever para o ficheiro
        List<ContaBancaria> movimentos = new ArrayList<>();

        try {
            PrintWriter fileWriter = new PrintWriter("src/Aula13/Exercicio3/movimentos.txt");
            fileWriter.println(descricao + "; " + valor);

            fileWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não é possivel adicionar");
        }

    }
}
