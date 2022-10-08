package IndependentWork3;

import java.util.Scanner;

public class ex2_divide2numbers {

    public static double division(double numb1, double numb2) {
        if (numb2 == 0) {
            System.out.println("The result is 0");
            return 0;
        } else {
            double result = numb1 / numb2;
            System.out.println("The result is " + result);
            return result;
        }
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Requested to insert the first number
        System.out.println("Please insert the first number:");
        double numb1 = keyboard.nextDouble();

        //Requested to insert the second number
        System.out.println("Please insert the second number:");
        double numb2 = keyboard.nextDouble();

        //Return result
        division(numb1,numb2);
    }
}