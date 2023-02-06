package IndependentWork4;

/*
recebe como argumento um número
natural e devolve verdadeiro caso seja primo, ou falso caso contrário.
 */
public class ex5 {
    public static void main(String[] args) {
        System.out.println(ePrimo(12));

    }

    public static boolean ePrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}