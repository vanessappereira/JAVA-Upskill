package independentWork9.vehiclesBase;

import independentWork9.vehicleType.VAir;

public class Airplane extends VAir {
    private int[] occupation= new int[30];

    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }

    public int[] getOccupation() {
        return occupation;
    }
}
