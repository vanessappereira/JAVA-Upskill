package independentWork9.vehiclesBase;

import independentWork9.vehicleType.VAir;
import independentWork9.vehicleType.VLand;
import independentWork9.vehicleType.VNautical;

public abstract class Vehicle {
    private int[] occupation;
    private VAir vAir;
    private VLand vLand;
    private VNautical vNautical;
    private double BASECONSUPTION = 5.0;

    public abstract double realConsuption();

    public double getBASECONSUPTION() {
        return BASECONSUPTION;
    }

    public int[] getOccupation() {
        return occupation;
    }

    public void setOccupation(int[] occupation) {
        this.occupation = occupation;
    }

    public VAir getvAir() {
        return vAir;
    }

    public void setvAir(VAir vAir) {
        this.vAir = vAir;
    }

    public VLand getvLand() {
        return vLand;
    }

    public void setvLand(VLand vLand) {
        this.vLand = vLand;
    }

    public VNautical getvNautical() {
        return vNautical;
    }

    public void setvNautical(VNautical vNautical) {
        this.vNautical = vNautical;
    }

    public void setBASECONSUPTION(double BASECONSUPTION) {
        this.BASECONSUPTION = BASECONSUPTION;
    }
}
