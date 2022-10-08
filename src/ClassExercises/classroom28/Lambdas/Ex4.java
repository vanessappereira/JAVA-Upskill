package ClassExercises.classroom28.Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        List<Lambdas.Carro> carros = new ArrayList<>();
        carros.add(new Lambdas.Carro("22-AA-26", 1990));
        carros.add(new Lambdas.Carro("32-CD-87",2006));
        //metodo comparador
        carros.sort(new Comparator<Lambdas.Carro>() {
            @Override
            public int compare(Lambdas.Carro o1, Lambdas.Carro o2) {
                return o1.getMatricula().compareTo(o2.getMatricula());
            }
        });

        //metodo lambda
        carros.sort((o1, o2) -> o1.getAno()- o2.getAno());

        // ou

        carros.sort(Comparator.comparingInt(Lambdas.Carro::getAno));
    }
}
