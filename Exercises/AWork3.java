package Exercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AWork3 {

    // 1. Return Age
    public static String returnAge() {
        int month, year;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter your birth year: ");
                year = keyboard.nextInt();
                if (year <= 0) {
                    System.out.println("Invalid year");
                    continue;
                } else if (year < 1900) {
                    System.out.print("You're too old for me to count");
                    continue;
                }
                System.out.print("Enter your birth month: ");
                month = keyboard.nextInt();
                if (month <= 0 || month > 12) {
                    System.out.println("Invalid month");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number." + e);
                keyboard.next(); // Clear the input
            }
        }

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, 1);
        Period period = Period.between(birthDate, today);

        keyboard.close();
        return "You are " + period.getYears() + " years old";
    }

    // 2. Divide 2 numbers, if zero, return 0
    public static String division() {
        double numb1, numb2;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a number: ");
                numb1 = keyboard.nextDouble();
                System.out.print("Enter another number: ");
                numb2 = keyboard.nextDouble();
                if (numb2 == 0) {
                    System.out.println("You can't divide by zero");
                    continue;
                }
                double result = numb1 / numb2;
                keyboard.close();

                return "The result is " + result;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number." + e);
                keyboard.next(); // Clear the input
            }
        }
    }

    // 3. Return true if isEven
    public static String isEven(int numb) {
        boolean bool;
        if (numb % 2 == 0) {
            bool = true;
            return "The number " + numb + " is even?" + bool;
        }

        bool = false;
        return "The number " + numb + " is even?" + bool;

    }

    // 4. Return true if isPositive
    public static String isPositive(int numb) {
        boolean bool;
        if (numb > 0) {
            bool = true;
            return "The number " + numb + " is positive?" + bool;
        }
        bool = false;
        return "The number " + numb + " is positive?" + bool;
    }

}