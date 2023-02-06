package IndependentWork8.E1Xadrez;

public class peao extends pecaDeXadrez {

    public peao(int coluna, int linha) {

        super(coluna, linha);
    }

    @Override
    public String[] movimentosPossiveis() {
        String[] movimentosPossiveis = new String[2];
        movimentosPossiveis[0] = "(" + getColuna() + "," + getLinha() + 1 + ")";
        movimentosPossiveis[0] = "(" + getColuna() + "," + getLinha() + 2 + ")";
        return movimentosPossiveis;
    }

}