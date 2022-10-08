package Aula3Scanner.aulas;

public class ex1 {
    public static int DecimalInteiro(double a) {

        int inteira = (int) a;
        double dec = a - inteira;

        if (dec < 0.5)
            return inteira;
            else
                return inteira+1;

    }
    public static void main(String[] args) {
        System.out.println(DecimalInteiro(2.6));
    }

}
