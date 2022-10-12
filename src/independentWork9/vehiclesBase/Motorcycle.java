package independentWork9.vehiclesBase;

import independentWork9.vehicleType.VLand;

public class Motorcycle extends VLand {
    private int[] occupation= new int[2];

    @Override
    public int[] getOccupation() {
        return occupation;
    }

    @Override
    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }
}
