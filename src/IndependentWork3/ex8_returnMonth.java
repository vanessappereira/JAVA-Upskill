package IndependentWork3;

import java.util.Scanner;

public class ex8_returnMonth {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Insert the number between 1 and 12 to confirm the month:");
        int a = k.nextInt();
        System.out.println("The month is: " + whichMonth(a) + ".");
    }

    public static String whichMonth(int a) {
        switch (a) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month!";
        }
    }
}
