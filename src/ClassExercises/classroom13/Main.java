package TA13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<carroOrcamento> infoOrcamento = new ArrayList<>();

        try {
            Scanner s = new Scanner(new File("src/TA13/infoReparacao.txt"));
                String line = s.nextLine();
                String[] tokens = line.split(";");
                s.close();
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (carroOrcamento carroOrcamento: infoOrcamento){
            System.out.println(infoOrcamento);
        }
    }
}