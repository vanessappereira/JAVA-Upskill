package IndependentWork2;

//diferenca entre 2 numeros
public class ex3 {
    public static void dif(int a, int b, int c) {
        int result1 = a - b, result2 = b - c, result3 = a - c;

        System.out.println("Difference between: " + a + " and " + b + " is: " + result1);
        System.out.println("Difference between: " + b + " and " + c + " is: " + result2);
        System.out.println("Difference between: " + a + " and " + c + " is: " + result3);
    }

    public static void main(String[] args) {
        dif(100, 20, 9);
    }
}