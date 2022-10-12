package IndependentWork2;

//soma de 2 numeros
public class ex1 {
    public static int sum(int a, int b) {
        System.out.println("Soma de a+b: " + (a + b));
        return a + b;
    }

    public static int sum2(int b, int c) {
        System.out.println("Soma de b+c: " + (b + c));
        return b + c;
    }

    public static int sum3(int a, int c) {
        System.out.println("Soma de a+c: " + (a + c));
        return a + c;
    }

    public static void main(String[] args) {
        sum(1, 2);
        sum2(5,6);
        sum3(7,9);
    }
}