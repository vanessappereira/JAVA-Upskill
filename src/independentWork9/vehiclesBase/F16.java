package independentWork9.vehiclesBase;

import independentWork9.vehicleType.VAir;

public class F16 extends VAir {
    private int[] occupation= new int[2];
    private boolean rescueMission;
    public boolean isRescueMission(){
        return rescueMission;
    }

    @Override
    public double realConsuption() {
        if (isRescueMission()){
            return super.realConsuption()*4;
        }
        return realConsuption();
    }

    @Override
    public int[] getOccupation() {
        return occupation;
    }

    @Override
    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }
}
