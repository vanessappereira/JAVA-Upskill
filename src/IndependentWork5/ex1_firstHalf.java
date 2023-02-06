package IndependentWork5;

import java.util.Arrays;

/*
Obter a primeira metade um vetor v, incluindo um parâmetro booleano para permitir se o elemento do meio é para incluir
(caso o comprimento do vetor seja ímpar). Se o comprimento for par, este parâmetro não terá efeito.
Exemplo: firstHalf({1,2,3,4,5}, true)->{1,2,3}
 */
public class ex1_firstHalf {
    public static int[] firstHalf(int[] n, boolean include) {
        // Divisão do array fornecido
        int t = n.length / 2;
        //Caso o resto divisivel do tamanho do array seja 1, inclui o valor do meio
        if (n.length % 2 == 1 && include) t = t + 1;
        int[] novo = new int[t];
        int i = 0;
        while (i < novo.length) {
            novo[i] = n[i];
            i = i + 1;
        }
        return novo;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstHalf(new int[]{1, 2, 3, 4, 5}, true)));
    }
}
