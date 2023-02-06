package IndependentWork9;

public class vNautico extends veiculos {
    private int lotacaoNautica;

    public vNautico(double combustivelBase) {
        super(combustivelBase);
    }

    public int getLotacaoNautica() {
        return lotacaoNautica;
    }

    public void setLotacaoNautica(int lotacaoNautica) {
        this.lotacaoNautica = lotacaoNautica;
    }

    @Override
    public double combAdicionado() {
        return (super.getCombustivelBase()*2);
    }
}
