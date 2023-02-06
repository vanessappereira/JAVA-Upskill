package IndependentWork9;

public class f16 extends vAereo {
    private boolean missaoResgate;
    private int[] lotacaoF16;

    public f16(int lotacaoAerea) {
        super(lotacaoAerea);
        this.missaoResgate=missaoResgate;
    }

    public boolean isMissaoResgate() {
        return missaoResgate;
    }

    public int[] getLotacaoF16() {
        return lotacaoF16;
    }

    @Override
    public double combAdicionado() {
        if (missaoResgate) {
            return (super.getCombustivelBase() * 4);
        } else {
            return (super.getCombustivelBase() * 3);
        }
    }
}
