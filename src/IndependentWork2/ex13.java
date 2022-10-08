package IndependentWork2;

//função que permita arredondar um valor decimal a 2 casas decimais
public class ex13 {
    public static void roundNumber(double a) {
        System.out.println("Original: " + a);
        double b = Math.round(a * 100.0) / 100.0;
        System.out.println("Duas casas decimais " + b);
    }

    public static void main(String[] args) {
        roundNumber(12.3456789);
    }
}
