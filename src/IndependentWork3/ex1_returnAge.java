package IndependentWork3;

import java.time.LocalDate;
import java.util.Scanner;

public class ex1_returnAge {
    public static int returnAgeFunction(int year) {
        int age = LocalDate.now().getYear() - year;
        return age;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Request to the user to insert the age
        System.out.println("Please insert your year of birth:");
        int year = keyboard.nextInt();
        //Return age
        System.out.println("You have " + returnAgeFunction(year) + " years");
    }
}
