package IndependentWork3;

import java.util.Scanner;

public class ex7_getGrades {
    public static String getGrade(int grade) {
        if (grade >= 90 && grade <= 100) {
            return "A";
        } else if (grade >= 80 && grade < 90) {
            return "B";
        } else if (grade >= 70 && grade < 80) {
            return "C";
        } else if (grade >= 50 && grade < 70) {
            return "D";
        } else if (grade >= 30 && grade < 50) {
            return "E";
        } else if (grade >= 0 && grade < 30) {
            return "F";
        }
        return "Invalid grade!";
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please insert the grade:");

        int grade = keyboard.nextInt();
        System.out.println("The grade is: " + getGrade(grade));
    }
}
