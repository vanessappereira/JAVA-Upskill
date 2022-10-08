package IndependentWork3;

import java.util.Scanner;

public class ex9_astrology {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Which sign are you?\n"+"Insert the day of your birth:");
        int day = k.nextInt();
        System.out.println("Please insert now the month");
        int month=k.nextInt();
        whichSignAreYou(day,month);
    }

    public static String whichSignAreYou(int day, int month) {
        if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println("The sign is Aries");
        } else if ((day >= 21 && month == 4) || (day <= 20 && month == 5)) {
            System.out.println("The sign is Taurus");
        } else if ((day >= 21 && month == 5) || (day <= 20 && month == 6)) {
            System.out.println("The sign is Gemini");
        } else if ((day >= 21 && month == 6) || (day <= 21 && month == 7)) {
            System.out.println("The sign is Cancer");
        } else if ((day >= 22 && month == 7) || (day <= 22 && month == 8)) {
            System.out.println("The sign is Leo");
        } else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
            System.out.println("The sign is Virgo");
        } else if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
            System.out.println("The sign is Libra");
        } else if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
            System.out.println("The sign is Scorpio");
        } else if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
            System.out.println("The sign is Sagittarius");
        } else if ((day >= 22 && month == 12) || (day <= 20 && month == 1)) {
            System.out.println("The sign is Capricorn");
        } else if ((day >= 21 && month == 1) || (day <= 19 && month == 2)) {
            System.out.println("The sign is Aquarius");
        } else if ((day >= 20 && month == 2) || (day <= 20 && month == 3)) {
            System.out.println("The sign is Pisces");
        }
        return "The date is not valid";
    }
}
