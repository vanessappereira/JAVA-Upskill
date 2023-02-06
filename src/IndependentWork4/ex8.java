package IndependentWork4;
/*
Construir um vetor de dígitos aleatórios (números de 0 a 9), dado o
comprimento.
Exemplo: randomDigits(5)->{8,2,9,1,2}
 */

import java.util.Arrays;

public class ex8 {
    public static int[] randomDigits(int n) {
        int[] random = new int[n];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 10);
        }
        return random;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomDigits(5)));
    }
}
