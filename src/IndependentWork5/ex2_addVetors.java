package IndependentWork5;

import java.util.Arrays;

/*
Construir um vetor juntando outros dois vetores (parte esquerda e
parte direita).
Exemplo: merge({1,2},{9,10})
 */
public class ex2_addVetors {

    public static int[] merge(int[] v1, int[] v2) {
        int[] newV = new int[v1.length + v2.length];
        int i = 0;
        while (i < v1.length) {
            newV[i] = v1[i];
            i = i + 1;
        }
        i = 0;
        while (i < v2.length) {
            newV[v1.length + i] = v2[i];
            i = i + 1;
        }
        return newV;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 2}, new int[]{9, 10})));
    }
}
