package Aula13.Exercicio2;

import Aula13.Exercicio1.pessoa;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Como te chamas?");
            String name = keyboard.nextLine();
            System.out.println("Quantos anos tens?");
            int age = keyboard.nextInt();

            //escrever para o ficheiro
        try {
            PrintWriter fileWriter = new PrintWriter("src/Aula13/Exercicio2/info.txt");
            fileWriter.println(name + ";" + age);
            fileWriter.close();
            System.out.println(fileWriter);
        } catch (FileNotFoundException e) {
            System.out.println("Não é possivel adicionar");
        }
        Scanner s = new Scanner("src/Aula13/Exercicio2/info.txt");
        String linha = s.nextLine();
        String[] tokens = linha.split(";");
        System.out.println(tokens);
    }
}
