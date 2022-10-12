package independentWork9.vehiclesBase;

import independentWork9.vehicleType.VNautical;

public class Boat extends VNautical {
    private int[] occupation= new int[10];

    public int[] getOccupation() {
        return occupation;
    }

    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }
}
