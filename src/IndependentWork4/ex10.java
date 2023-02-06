package IndependentWork4;
/*
Copiar (replicar) um vetor de inteiros, tendo o novo vetor o mesmo
tamanho do argumento.
Exemplo: copy({1,2,3},6)->{1,2,3,0,0,0}
Exemplo: copy({1,2,3,4,5,6},3)->{1,2,3}
 */

import java.util.Arrays;

public class ex10 {
    public static int[] copy(int[] v, int a) {
        int[] novo = new int[a];
        for (int i = 0; i < novo.length; i++) {
            if (i >= v.length) {
                novo[i] = 0;
            } else {
                novo[i] = v[i];
            }
        }
        return novo;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copy(new int[]{1, 2, 3}, 6)));
        System.out.println(Arrays.toString(copy(new int[]{1, 2, 3, 4, 5, 6}, 3)));
    }
}
