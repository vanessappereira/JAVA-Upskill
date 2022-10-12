package independentWork9.vehiclesBase;

import independentWork9.vehicleType.VLand;

public class Bus extends VLand {
    private int[] occupation= new int[30];

    public int[] getOccupation() {
        return occupation;
    }

    @Override
    public double realConsuption() {
        if (getOccupation().length < getOccupation().length / 2) {
            return realConsuption() * 2;
        }
        return super.realConsuption();
    }

    @Override
    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }
}
