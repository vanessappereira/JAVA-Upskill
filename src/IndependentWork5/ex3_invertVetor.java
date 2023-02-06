package IndependentWork5;

import java.util.Arrays;

/*
Construir um vetor invertido com base noutro. Ou seja, o novo vetor
será composto pelos elementos do vetor dado pela ordem inversa.
Exemplo: invert({1,2,3)}->{3,2,1}
 */
public class ex3_invertVetor {
    public static int[] inverted(int[] v1) {
        //Criação do vetor inverso
        int[] inverso = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            inverso[i] = v1[v1.length - i - 1];
        }
        return inverso;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverted(new int[]{1, 2, 3})));
    }
}

