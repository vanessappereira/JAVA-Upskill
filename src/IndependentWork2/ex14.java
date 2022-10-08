package IndependentWork2;

public class ex14 {
    public static void roundNumber2(double a) {
        System.out.println("Original: " + a);

        double b = Math.round(a * 10.0) / 10.0;
        System.out.println("Uma casa decimal " + b);

        b = Math.round(a * 1000.0) / 1000.0;
        System.out.println("Tres casas decimais " + b);

        b = Math.round(a * 10000.0) / 10000.0;
        System.out.println("Quatro casas decimais " + b);
    }

    public static void main(String[] args) {
        roundNumber2(12.3456789);
    }
}
