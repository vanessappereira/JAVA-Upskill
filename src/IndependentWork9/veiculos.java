package IndependentWork9;

public abstract class veiculos {
    private double combustivelBase=5;


    public veiculos(double combustivelBase){

    }

    public double getCombustivelBase() {
        return combustivelBase;
    }

    public abstract double combAdicionado();

}
