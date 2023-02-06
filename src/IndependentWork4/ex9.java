package IndependentWork4;
/*
Construir um vetor capaz de armazenar 50 números inteiros. Em
seguida faça o seu preenchimento automático com os números 101 a
150, ou seja na posição número 0 fica 101, na posição número 1 fica 102
e por aí adiante.
 */

import java.util.Arrays;

public class ex9 {
    public static int[] inteiros() {
        int[] intNumb = new int[50];
        for (int i = 0; i < intNumb.length; i++) {
            intNumb[i] = 101 + i;
        }
        return intNumb;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inteiros()));
    }
}
