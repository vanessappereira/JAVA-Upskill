package independentWork9.vehicleType;

import independentWork9.vehiclesBase.Vehicle;

public class VAir extends Vehicle {
    private int airOccupation;


    @Override
    public double realConsuption() {
        return getBASECONSUPTION()*3;
    }


}
