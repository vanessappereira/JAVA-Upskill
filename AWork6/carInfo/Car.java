package AWork6.carInfo;

public class Car {

    private final String brand, model, licensePlate;
    private double consuption = 0;
    private double avgConsuption = 0;
    private double atualCapacity;
    private final double maxCapacity;
    private boolean isOn = false;

    public Car(String brand, String model, String licensePlate, int carSeats, int registryMonth, int registryYear,
            double atualCapacity, double maxCapacity) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.atualCapacity = atualCapacity;
        this.maxCapacity = maxCapacity;
    }

    // Getters and setters
    public void setConsuption(double consuption) {
        this.consuption = consuption;
    }

    public void setCarSeats(int carSeats) {
    }

    public double getConsuption() {
        return consuption;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Fill tank
    public void fillTank(double litres) {

        if (atualCapacity + litres < maxCapacity) {
            this.atualCapacity += litres;

            System.out.println("Filled with " + litres + " the current gas is: " + this.atualCapacity);
        } else {
            System.out.println("Can't fill with " + litres + " litres, the max capacity is: " + maxCapacity + " and you have: "
                    + atualCapacity);
        }
    }

    // AVG Consuption
    public double avgRunConsuption(double distance, double litres) {
        avgConsuption = (distance / litres) * 100;
        atualCapacity -= avgConsuption;
        System.out.println("The avegrage is: " + avgConsuption);
        return avgConsuption;
    }

    // Set the car on
    public boolean setCarOnOff() {
        isOn = !isOn;
        return isOn;
    }

    @Override
    public String toString() {
        return """
               Car: 
               brand:""" + getBrand() + "\n"
                + "model: " + getModel() + "\n"
                + "licensePlate: " + getLicensePlate() + "\n"
                + "Is the car turned on? " + isOn;
    }
}
