package independentWork9.vehiclesBase;

import independentWork9.vehicleType.VLand;

public class Car extends VLand {
    private int[] occupation= new int[5];

    @Override
    public int[] getOccupation() {
        return occupation;
    }

    @Override
    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }
}
