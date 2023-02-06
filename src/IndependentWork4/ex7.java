package IndependentWork4;

/*
Construir um vetor de números naturais até um dado número n.
Exemplo: naturals(5)->{1,2,3,4,5}
 */
public class ex7 {
    public static int[] naturals(int n) {
        int[] naturals = new int[n];
        for (int i = 0; i < naturals.length; i++) {

            naturals[i] = i + 1;

        }
        return naturals;
    }

    public static void main(String[] args) {
        System.out.println(naturals(258));
    }
}
