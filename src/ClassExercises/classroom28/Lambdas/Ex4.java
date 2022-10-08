package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("22-AA-26", 1990));
        carros.add(new Carro("32-CD-87",2006));
        //metodo comparador
        carros.sort(new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getMatricula().compareTo(o2.getMatricula());
            }
        });

        //metodo lambda
        carros.sort((o1, o2) -> o1.getAno()- o2.getAno());

        // ou

        carros.sort(Comparator.comparingInt(Carro::getAno));
    }
}
