package IndependentWork6.ex3_addCar;

public class Car {
    private String license, brand, model;
    private int nrSeats, registerMonth, registerYear;
    private double consumption, currentCapacity, MaxFuel;
    private boolean isOn = false;
    private Person carOwner;

    public Car(String license, String brand, String model, int nrSeats, int registerMonth,
               int registerYear, double consumption, double MaxFuel) {
        this.license = license;
        this.brand = brand;
        this.model = model;
        this.nrSeats = nrSeats;
        this.registerMonth = registerMonth;
        this.registerYear = registerYear;
        this.consumption = consumption;
        this.currentCapacity = currentCapacity;
        this.MaxFuel = MaxFuel;
    }

    public void fillTank() {
        setCurrentCapacity(getMaxFuel());
    }

    public void run(int kms) {
        double consumptionByKM = getConsumption() / 100.0;
        double totalConsumption = consumptionByKM * kms;
        this.currentCapacity = getCurrentCapacity() - totalConsumption;

    }

    public boolean setOn() {
        //if different values, return false
        isOn = !isOn;
        return isOn;
    }

    public void registerCarOwner(Person carOwner) {
        setCarOwner(carOwner);
        setRegisterMonth(registerMonth);
        setRegisterYear(registerYear);
        setLicense(license);
    }

    @Override
    public String toString() {
        return  "Info: " +
                "Proprietary: " + getCarOwner() + " | Licence plate:" + getLicense() + " Brand " + getBrand() +
                " Model: "+ getModel() + " Registered in: " + getRegisterYear() + getRegisterMonth() ;
    }

    ////////////////////////////    SETS    ////////////////////////////
    public void setLicense(String license) {
        this.license = license;
    }

    public void setRegisterMonth(int registerMonth) {
        this.registerMonth = registerMonth;
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
    }

    public void setCurrentCapacity(double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void setCarOwner(Person carOwner) {
        this.carOwner = carOwner;
    }

////////////////////////////    GETS    ////////////////////////////

    public String getLicense() {
        return license;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRegisterMonth() {
        return registerMonth;
    }

    public int getRegisterYear() {
        return registerYear;
    }

    public double getConsumption() {
        return consumption;
    }

    public double getCurrentCapacity() {
        return currentCapacity;
    }

    public double getMaxFuel() {
        return MaxFuel;
    }

    public Person getCarOwner() {
        return carOwner;
    }
}