package IndependentWork2;

//devolver o numero inteiro aproximado
public class ex10 {
    public static void main(String[] args) {
        inteiro(33.4);
    }

    public static void inteiro(double a) {
        int valorMaisProximo = (int) Math.round(a);
        System.out.println("The closest number is: " + valorMaisProximo);
    }
}
