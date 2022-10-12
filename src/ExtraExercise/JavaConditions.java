import java.util.Scanner;


public class JavaConditions {
    public static void main(String[] args) {
        //isPositive();
        //quadrEquations();
    }


    ////////////////////////////////////////////
//1. Write a Java program to get a number from the user and print whether it is positive or negative.
    public static void isPositive() {
        Scanner s = new Scanner(System.in);
        int number;

        System.out.println("Please insert the number: ");
        number = s.nextInt();

        if (number < 0) {
            System.out.println("This number is negative.");
        } else if (number > 0) {
            System.out.println("This number is positive.");
        } else {
            System.out.println("This number is neutral.");
        }
    }

    ////////////////////////////////////////////
//2. Write a Java program to solve quadratic equations (use if, else if and else).
    public static double quadrEquations() {
        Scanner s = new Scanner(System.in);
        double a, b, c, result, r1, r2;

        System.out.print("Input a: ");
        a = s.nextDouble();
        System.out.print("Input b: ");
        b = s.nextDouble();
        System.out.print("Input c: ");
        c = s.nextDouble();

        result = b * b - 4 * a * c;
        if (result > 0.0) {
            r1 = (-b + Math.pow(result, 0.5)) / (2 * a);
            r2 = (-b - Math.pow(result, 0.5)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0) {
            r1 = -b / (2 * a);
            System.out.println("The root is: " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        return 0;
    }


}
