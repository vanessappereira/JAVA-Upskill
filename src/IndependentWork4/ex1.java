package IndependentWork4;

//mostre a soma de todos os números no intervalo de 1 até 100 utilizando o While
public class ex1 {

    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int soma = 0, i = 0;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("A soma dos 100 primeiros números é: " + soma);
    }
}