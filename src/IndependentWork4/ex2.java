package IndependentWork4;

//mostre a soma de todos os números no intervalo de 1 até 100 utilizando o for
public class ex2 {


    public static void main(String[] args) {
        sum2();
    }

    public static void sum2() {
        int soma = 0;
        for (int i = 0; i < 100; i++) {
            soma += i;
            System.out.println("A soma dos primeiros numeros é: " + soma);
        }
    }

}