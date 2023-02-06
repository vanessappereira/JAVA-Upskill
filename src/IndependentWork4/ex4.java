package IndependentWork4;

/*
Devolver o somatorio dos divisores proprios de n excluido o proprio numero.
deverá acumular os numeros que são divisores de n

 */
public class ex4 {

    public static void divisoresSomatorio(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        divisoresSomatorio(8);
    }
}