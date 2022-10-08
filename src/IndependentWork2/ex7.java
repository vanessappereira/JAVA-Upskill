package IndependentWork2;

//Celsius to Kelvin
public class ex7 {
    public static void Kelvin(double Celsius) {
        double kelvin = Celsius + 273.15;
        System.out.println("The temperature in Kelvin is: " + kelvin);
    }

    public static void main(String[] args) {
        Kelvin(37.5);
    }
}
