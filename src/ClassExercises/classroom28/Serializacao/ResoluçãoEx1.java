package ClassExercises.classroom28.Serializacao;

import java.io.*;
import java.util.Scanner;

public class ResoluçãoEx1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor insira o n 1 para salvar dados, ou 2 para carregar dados.");
        String opt = s.nextLine();
        if (opt.equals("1")){ //salvar dados
            System.out.println("Coloque o nome");
            String nome = s.nextLine();
            System.out.println("Coloque a nota");
            String nota = s.nextLine();
            System.out.println("Coloque o titulo");
            String titulo = s.nextLine();
            System.out.println("Coloque o nome do ficheiro");
            String filename = s.nextLine();
            try {
                guardar(new Nota(nome, titulo, nota), filename);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (opt.equals("2")){ // carregar dados
            System.out.println("Insira o ficheiro a carregar");
            String filename = s.nextLine();

            Nota n = null;
            try {
                n = ler(filename);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println(n);

        }
    }

    private static Nota ler(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Nota n = (Nota) in.readObject();
        fileIn.close();
        in.close();
        return n;
    }

    private static void guardar(Nota nota, String filename) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        fileOut.close();
        out.close();
    }

}
