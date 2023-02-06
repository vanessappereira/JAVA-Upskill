package IndependentWork5;

import java.util.Arrays;

import static IndependentWork5.ex1_firstHalf.firstHalf;
import static IndependentWork5.ex2_addVetors.merge;

/*
Construir um vetor com base noutro, representando uma cópia sem o elemento do meio (caso o tamanho seja ímpar).
Exemplo: copyWithoutMiddleElement({1,2,3,4,5})->{1,2,4,5}
 */
public class ex6_copyWithoutMiddle {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copiarSemMeio(new int[]{1, 2, 3, 4, 5})));
    }

    //Criação de um subArray com o valor de início, de fim, e um vetor de inteiros.
    public static int[] subArray(int a, int b, int[] vetor) {
        int[] v = new int[b - a + 1];   //Inicialização de uma variável v
        for (int i = 0; i < v.length; i++) {
            v[i] = vetor[i + a];
        }
        return v;
    }

    public static int[] copiarSemMeio(int[] vetor) {
        //Usado as funções do exercício 1
        int[] firstHalf = firstHalf(vetor, false);
        int[] secondHalf = subArray(vetor.length / 2 + 1, vetor.length - 1, vetor);
        return merge(firstHalf, secondHalf);
    }
}
