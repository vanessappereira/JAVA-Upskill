package IndependentWork9;

public class vTerrestre extends veiculos{
    private int lotacaoTerrestre;

    public vTerrestre(double combustivelBase) {
        super(combustivelBase);
    }


    public int getLotacaoTerrestre() {
        return lotacaoTerrestre;
    }

    @Override
    public double combAdicionado() {
        return (super.getCombustivelBase());
    }
}
