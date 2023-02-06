package IndependentWork2;

public class independentWork2 {
    //  1.  Sum between 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //  2.  Square of a number
    public static double square(int a) {
        return Math.sqrt(a);
    }

    //  3.  Difference between 2 numbers
    public static int diff(int a, int b) {
        return a - b;
    }

    //  4.  Average
    public static int avg(int a, int b) {
        return (a + b) / 2;
    }

    //  5.  Rectangle Area
    public static int area(int a, int b) {
        return a * b;
    }

    //  6.  Celsius to Fahrenheit
    public static void Fahrenheit(double Celsius) {
        double fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    //  7.  Celsius to Kelvin
    public static void Kelvin(double Celsius) {
        double kelvin = Celsius + 273.15;
        System.out.println("The temperature in Kelvin is: " + kelvin);
    }

    //  8.  cm in pol
    public static void pol(double cm) {
        double pol = cm * 0.39370;
        System.out.println("Size in pol: " + pol);
    }

    //  9.  Get Tax IVA 23%
    public static void iva(double a) {
        double iva = a * 0.23;
        System.out.println("The tax value is: " + iva);
    }

    //    10.   Nearest value
    public static int nearestValue(double a) {
        return (int) Math.round(a);
    }

    //    11.   Circle Perimeter P = d. π
    public static void circleP(double diameter) {
        double perimeter = diameter * Math.PI;
        System.out.println("The perimeter of a circle is: " + perimeter);
    }

    //    12.   Rectangular Prism Area
    public static void areaPrism(int largura, int altura, int comprimento) {
        int areaprisma = 2 * (largura * comprimento) + 4 * (comprimento * altura);
        System.out.println("The prism area is: " + areaprisma);
    }

    //    13.   Round value to 2 decimal places
    public static void roundNumber(double a) {
        System.out.println("Original: " + a);
        double b = Math.round(a * 100.0) / 100.0;
        System.out.println("Duas casas decimais " + b);
    }

    //    14.   Round value to 1, 3 and 4 decimal places
    public static void roundNumber2(double a) {
        System.out.println("Original: " + a);

        double b = Math.round(a * 10.0) / 10.0;
        System.out.println("One decimal place " + b);

        b = Math.round(a * 1000.0) / 1000.0;
        System.out.println("Three decimal places " + b);

        b = Math.round(a * 10000.0) / 10000.0;
        System.out.println("Four decimal places " + b);
    }
}
