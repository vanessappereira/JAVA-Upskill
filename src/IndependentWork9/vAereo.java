package IndependentWork9;

public class vAereo extends veiculos{

    private int lotacaoAerea;
    private double combAdicionado;

    public vAereo(double combustivelBase) {
        super(combustivelBase);
        this.combAdicionado=combAdicionado;

    }


    public int getLotacaoAerea() {
        return lotacaoAerea;
    }


    @Override
    public double combAdicionado() {
        return (super.getCombustivelBase()*3);
        }
    }
