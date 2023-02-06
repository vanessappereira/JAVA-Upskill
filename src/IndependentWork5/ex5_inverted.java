package IndependentWork5;

import java.util.Arrays;

import static IndependentWork5.ex2_addVetors.merge;
import static IndependentWork5.ex3_invertVetor.inverted;

/*
Construir um vetor com base noutro, sendo a primeira metade uma cópia e a segunda metade os mesmos elementos
pela ordem inversa.
Exemplo: duplicateInverted({3,2,1})->(3,2,1,1,2,3)
 */
public class ex5_inverted {

    public static int[] duplicarInvertido(int[] vetor) {
        // Merge retirado do exercício 2,, e o inverted do exercicio 3
        return merge(vetor, inverted(vetor));
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicarInvertido(new int[]{3, 2, 1})));
    }
}
