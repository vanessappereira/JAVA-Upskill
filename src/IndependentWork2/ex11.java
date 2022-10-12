package IndependentWork2;

//Perimetro circulo usando diametro P = d. π
public class ex11 {
    public static void perimeter(double diameter) {
        double perimeter = diameter * Math.PI;
        System.out.println("The perimeter of a circle is: " + perimeter);
    }

    public static void main(String[] args) {
        perimeter(24);
    }
}
