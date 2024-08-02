package AWork6.carInfo;

public class Main {

    public static void main(String[] args) {
        Car carA = new Car("Toyota", "Camry", "23-BB-23", 5, 2, 2015, 12.2, 30);

        double fuelToAdd = 20.0;
        carA.fillTank(fuelToAdd);

        int distance = 2;
        double fuelConsumed = 20;
        carA.avgRunConsuption(distance, fuelConsumed);

        // Toggle the car's state (on/off)
        carA.setCarOnOff();

        // Print the car's details
        System.out.println(carA.toString());
    }
}
