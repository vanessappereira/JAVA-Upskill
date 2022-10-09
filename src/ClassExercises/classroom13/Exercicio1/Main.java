package ClassExercises.classroom13.Exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<pessoa> pessoas = new ArrayList<pessoa>();
        try {
            Scanner s = new Scanner(new File("pessoas.txt"));
            while (s.hasNextLine()){
                String line = s.nextLine();
                //Joao;23;Lisboa -> ["Joao", 23, "Lisboa"]
                String[] tokens = line.split(";");
                pessoa p = new pessoa(tokens[0],Integer.parseInt(tokens[1], Integer.parseInt(tokens[2])));
                pessoas.add(p);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        for(pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
}
