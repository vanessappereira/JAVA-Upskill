package independentWork9.vehicleType;

import independentWork9.vehiclesBase.Vehicle;

public class VNautical extends Vehicle {
    private int[] occupation;

    @Override
    public double realConsuption() {
        return getBASECONSUPTION() * 2;
    }

    public int[] getOccupation() {
        return occupation;
    }

    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }
}
