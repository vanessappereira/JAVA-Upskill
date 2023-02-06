package IndependentWork4;
/*
Criar uma função que permite saber se existe algum número primo
num dado intervalo (aberto).
 */

import static IndependentWork4.ex5.ePrimo;

public class ex6 {
    public static void main(String[] args) {
        System.out.println(primoIntervalo(12, 7));
    }

    public static boolean primoIntervalo(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (ePrimo(i)) {
                return true;
            }
        }
        return false;
    }
}
