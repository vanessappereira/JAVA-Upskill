package IndependentWork9;

public class autocarro extends vTerrestre {
    private int[] lotacaoAuto;

    public autocarro(int lotacaoTerrestre) {
        super(lotacaoTerrestre);
        this.lotacaoAuto=lotacaoAuto;
    }

    public int[] getLotacaoAuto() {
        return lotacaoAuto;
    }

    @Override
    public double combAdicionado() {
        if (lotacaoAuto.length < (lotacaoAuto.length / 2)) {
            return (super.getCombustivelBase() * 2);
        } else {
            return super.getCombustivelBase();
        }
    }
}
