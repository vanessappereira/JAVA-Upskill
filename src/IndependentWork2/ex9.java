package IndependentWork2;

//obter IVA 23%
public class ex9 {
    public static void iva(double a) {
        double iva = a * 0.23;
        System.out.println("The tax value is: " + iva);
    }

    public static void main(String[] args) {
        iva(150);
    }
}
