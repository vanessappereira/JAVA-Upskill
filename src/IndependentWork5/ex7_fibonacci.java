package IndependentWork5;

import java.util.Arrays;

/*
Construir um vetor com n números da sequência Fibonacci.
Exemplo: fibonacciSequence(7)-> {0,1,1,2,3,5,8}
 */
public class ex7_fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSequence(7)));
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int[] fibonacciSequence(int n) {
        int[] novo = new int[n];

        for (int i = 0; i < novo.length; i++) {
            novo[i] = fibonacci(i);
        }
        return novo;
    }
}
