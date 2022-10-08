package Aula12.Exercicio2;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {


        HashMap<String,carro> mapaCarros = new HashMap<String,carro>();
        carro carro1 = new carro("Ford Fiesta","23-BC-24",2004);
        carro carro2 = new carro("Peugeot 407","11-AA-33", 2018);

        mapaCarros.put("23-BC-24",carro1);
        mapaCarros.put(carro2.getMatricula(),carro2);


        //mapaCarros.remove("23-BC-24");


        System.out.println("-------------------");
        carro carro4 = mapaCarros.get("11-AA-33");
        System.out.println(carro4.getAnoVenda());
    }
}
