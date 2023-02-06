package IndependentWork3;

import java.util.Scanner;

public class ex6_wheels {
    public static int numberWheels(int vehicle) {
        switch (vehicle) {
            case 1:
            case 5:
                return 4;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 6:
                return 1;
            default:
                System.out.println("Error in inserted option!");
        }
        return vehicle;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select an option to get the number of IndependentWork3.wheels: " + " \n" +
                "1. Car" + " \n" +
                "2. Bike" + " \n" +
                "3. Bicycle" + " \n" +
                "4. Tricycle" + " \n" +
                "5. Truck" + " \n" +
                "6. Monocycle");
        //User select an option
        int vehicle = keyboard.nextInt();

        System.out.println("The vehicle has "+ numberWheels(vehicle)+" IndependentWork3.wheels.");
    }
}
