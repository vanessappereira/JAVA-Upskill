package IndependentWork2;

//o quadrado dos numeros
public class ex2 {
    public static void square(int a) {
        int result = a * a;
        System.out.println("The square of: " + a + " is " + result);
    }

    public static void square2(int b) {
        int result = b * b;
        System.out.println("The square of: " + b + " is " + result);
    }

    public static void square3(int c) {
        int result = c * c;
        System.out.println("The square of: " + c + " is " + result);
    }

    public static void main(String[] args) {
        System.out.println("O quadrado dos numeros: ");
        square(2);
        square2(5);
        square3(7);
    }
}

