package IndependentWork4;

/*
devolva o número de divisores de um número inteiro n.
Esta função deverá iterar sobre os números naturais até n, contando os números que são divisores de n.
*/
public class ex3 {

    public static void divisores(int n) {
        int numero = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numero++;
            }
        }
        System.out.println(numero);
    }

    public static void main(String[] args) {
        divisores(15);
    }
}