
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AWork3 {

    // 1. Return Age
    public static String returnAge() {
        int month, year;
        Period period;
        try (Scanner keyboard = new Scanner(System.in)) {
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
            }   LocalDate today = LocalDate.now();
            LocalDate birthDate = LocalDate.of(year, month, 1);
            period = Period.between(birthDate, today);
        }
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

    // 5. Return content written
    public static String printContent() {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Please write you content: ");
            String content = keyboard.nextLine();

            keyboard.close();

            return "You wrote: " + content;
        }
    }

    // 6. Return number of wheels of a vehicle
    public static String numberOfWheels() {
        String result;
        int numb;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Please enter the number of wheels: ");
            numb = keyboard.nextInt();
        }
        result = switch (numb) {
            case 1 -> "The vehicle is a monocycle";
            case 2 -> "The vehicle is a bicycle";
            case 3 -> "The vehicle is a tricycle";
            case 4 -> "The vehicle is a car";
            case 6 -> "The vehicle is a truck";
            default -> "The vehicle is a bus";
        };
        return result;
    }

    // 7. Return grades A+ (90-100); A (80 - 90); B (70 - 80); C (50 -70); D (30 -
    // 50); E (0 - 30);
    // If its out of scale, should return "Invalid Grade"
    public static String getGrade() {
        String result;
        int grade;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Please enter your grade: ");
            grade = keyboard.nextInt();
        }

        if (grade >= 90 && grade <= 100) {
            result = "A+";
        } else if (grade >= 80 && grade <= 89) {
            result = "A";
        } else if (grade >= 70 && grade <= 79) {
            result = "B";
        } else if (grade >= 50 && grade <= 69) {
            result = "C";
        } else if (grade >= 30 && grade <= 49) {
            result = "D";
        } else if (grade >= 0 && grade <= 29) {
            result = "E";
        } else {
            result = "Invalid Grade";
        }

        return result;
    }

    // 8. Receive an int and return the month. Use switch-case
    public static String getMonth(int month) {
        String result;
        result = switch (month) {
            case 1 -> "The month is January";
            case 2 -> "The month is February";
            case 3 -> "The month is March";
            case 4 -> "The month is April";
            case 5 -> "The month is May";
            case 6 -> "The month is June";
            case 7 -> "The month is July";
            case 8 -> "The month is August";
            case 9 -> "The month is September";
            case 10 -> "The month is October";
            case 11 -> "The month is November";
            case 12 -> "The month is December";
            default -> "Invalid Month";
        };
        return result;
    }

    // 9. Astrology: Request day and month to the user
    public static String whichSignAreYou() {
        int day, month;
        String result;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Which sign are you? \nEnter the day: ");
            day = keyboard.nextInt();
            System.out.print("Enter the month: ");
            month = keyboard.nextInt();

            keyboard.close();

            if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
                result = "Your sign is Aries";
            } else if ((day >= 21 && month == 4) || (day <= 20 && month == 5)) {
                result = "Your sign is Taurus";
            } else if ((day >= 21 && month == 5) || (day <= 20 && month == 6)) {
                result = "Your sign is Gemini";
            } else if ((day >= 21 && month == 6) || (day <= 21 && month == 7)) {
                result = "Your sign is Cancer";
            } else if ((day >= 22 && month == 7) || (day <= 22 && month == 8)) {
                result = "Your sign is Leo";
            } else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
                result = "Your sign is Virgo";
            } else if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
                result = "Your sign is Libra";
            } else if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
                result = "Your sign is Scorpio";
            } else if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
                result = "Your sign is Sagittarius";
            } else if ((day >= 22 && month == 12) || (day <= 20 && month == 1)) {
                result = "Your sign is Capricorn";
            } else if ((day >= 21 && month == 1) || (day <= 19 && month == 2)) {
                result = "Your sign is Aquarius";
            } else if ((day >= 20 && month == 2) || (day <= 20 && month == 3)) {
                result = "Your sign is Pisces";
            } else {
                result = "Invalid day or month";
            }
            break;
        }
        return result;
    }

    // 10. Request 3 numbers to user and order them.
    public static String orderNumbers() {
        int num1, num2, num3;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Crescent order \\nEnter the first number: ");
            num1 = keyboard.nextInt();
            System.out.print("Enter the second number: ");
            num2 = keyboard.nextInt();
            System.out.print("Enter the third number: ");
            num3 = keyboard.nextInt();
        }

        int[] numbers = { num1, num2, num3 };
        Arrays.sort(numbers);
        return "The numbers in crescent order are: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2];
    }

}