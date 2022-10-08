import java.sql.SQLOutput;

public class Car {
    private final String model, brand, licencePlate;
    private final int seats, registryMonths, year;
    private double depositAmount, averageConsume, currentCapacity;
    private boolean isOn;

    public Car(String model, String brand, String licencePlate,
               int seats, int registryMonths, int year, double depositAmount,
               double averageConsume, double currentCapacity) {
        this.model = model;
        this.brand = brand;
        this.licencePlate = licencePlate;
        this.seats = seats;
        this.registryMonths = registryMonths;
        this.year = year;
        this.depositAmount = depositAmount;
        this.averageConsume = averageConsume;
        this.currentCapacity = currentCapacity;
        this.isOn = false;

    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public int getSeats() {
        return seats;
    }

    public int getRegistryMonths() {
        return registryMonths;
    }

    public int getYear() {
        return year;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getAverageConsume() {
        return averageConsume;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setAverageConsume(double averageConsume) {
        this.averageConsume = averageConsume;
    }

    public void setCurrentCapacity(double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void encherDeposito(double litros) {
        if (this.currentCapacity+litros>= this.depositAmount){
            setCurrentCapacity(depositAmount);
            System.out.println("Cuidado, já atestaste!");
        } else{
            setCurrentCapacity(currentCapacity+litros);
        }
    }


    public void run(int km){
        double consume = (this.averageConsume*km)/100;
        System.out.println("Gastei " + consume);
        setCurrentCapacity(this.currentCapacity-consume);
        if(this.currentCapacity<=0){
            System.out.println("VAI ABASTECER!");
        }
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    public boolean isLigado(){
        return isOn;
    }
}





