public class AWork1 {
    public static String sum(int a, int b) {
        int result = a + b;
        return "The result between " + a + " and " + b + " is: " + result;
    }

    // 2. Square of a number
    public static String square(int a) {
        double result = Math.sqrt(a);
        return "The square of " + a + " is: " + result;
    }

    // 3. Difference between 2 numbers
    public static String diff(int a, int b) {
        int result = a - b;
        return "The difference between " + a + " and " + b + " is: " + result;
    }

    // 4. Average
    public static String avg(int a, int b) {
        double result = (a + b) / 2.0;
        return "The average between " + a + " and " + b + " is: " + result;
    }

    // 5. Rectangle Area
    public static String rectanglArea(int a, int b) {
        int result = a * b;
        return "The area of the rectangle with " + a + " and " + b + " is: " + result;
    }

    // 6. Celsius to Fahrenheit
    public static String Fahrenheit(double Celsius) {
        double fahrenheit = (Celsius * 1.8) + 32;
        return "The temperature in Fahrenheit is: " + fahrenheit;
    }

    // 7. Celsius to Kelvin
    public static String Kelvin(double Celsius) {
        double kelvin = Celsius + 273.15;
        return "The temperature in Kelvin is: " + kelvin;
    }

    // 8. cm in pol
    public static String pol(double cm) {
        double pol = cm * 0.39370;
        return "Size in pol: " + pol;
    }

    // 9. Get Tax IVA 23%
    public static String iva(double a) {
        double iva = a * 0.23;
        return "The tax value is: " + iva;
    }

    // 10. Nearest value
    public static String nearestValue(double a) {
        double nearest = Math.round(a * 100.0) / 100.0;
        return "The nearest value is: " + nearest;
    }

    // 11. Circle Perimeter P = d. π
    public static String circleP(double diameter) {
        double perimeter = diameter * Math.PI;
        return "The perimeter of a circle is: " + perimeter;
    }

    // 12. Rectangular Prism Area
    public static String areaPrism(int width, int height, int length) {
        int prismArea = 2 * (width * length) + 4 * (length * height);
        return "The prism area is: " + prismArea;
    }

    // 13. Round value to 2 decimal places
    public static String roundNumber(double a) {
        double rounded = Math.round(a * 100.0) / 100.0;
        return "Original: " + a
                + "\nRounded number to 2 decimal places: " + rounded;
    }

    // 14. Round value to 1, 3 and 4 decimal places
    public static String roundNumber2(double a) {
        double oneDecimalPlace = Math.round(a * 10.0) / 10.0;
        double threeDecimalPlaces = Math.round(a * 1000.0) / 1000.0;
        double fourDecimalPlaces = Math.round(a * 10000.0) / 10000.0;

        return "Original: " + a
                + "\nOne decimal place " + oneDecimalPlace
                + "\nThree decimal places " + threeDecimalPlaces
                + "\nFour decimal places " + fourDecimalPlaces;
    }
}