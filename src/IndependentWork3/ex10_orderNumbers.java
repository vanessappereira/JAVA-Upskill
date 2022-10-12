package IndependentWork3;

import java.util.Arrays;
import java.util.Scanner;

public class ex10_orderNumbers {
    public static void main(String[] args) {
        crescentNumbers();
    }
    public static void crescentNumbers() {
        Scanner k = new Scanner(System.in);
        System.out.print("Crescent order \n" + "First number: ");
        int n1 = k.nextInt();
        System.out.print("Second number: ");
        int n2 = k.nextInt();
        System.out.println("Third number: ");
        int n3 = k.nextInt();

        //Added number to an array of int
        int[] array = {n1, n2, n3};
        //Order
        Arrays.sort(array);
        //Convert to String
        System.out.println("These numbers are now in crescent order: \n" + Arrays.toString(array));
    }
}
