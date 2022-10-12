package IndependentWork2;

//Celsius to Fahrenheit
public class ex6 {
    public static void Fahrenheit(double Celsius) {
        double fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    public static void main(String[] args) {
        Fahrenheit(35.8);
    }
}

