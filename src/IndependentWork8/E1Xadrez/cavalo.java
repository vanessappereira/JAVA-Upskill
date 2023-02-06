package IndependentWork8.E1Xadrez;

public class cavalo extends pecaDeXadrez {

    public cavalo(int coluna, int linha) {
        super(coluna, linha);
    }

    @Override
    public String[] movimentosPossiveis() {
        String[] movimentosPossiveis = new String[8];
        movimentosPossiveis[0] = "(" + (getColuna()+1) + "," + (getLinha()+2) + ")";
        movimentosPossiveis[1] = "(" + (getColuna()-1) + "," + (getLinha()+2) + ")";
        movimentosPossiveis[2] = "(" + (getColuna()-2) + "," + (getLinha()+1) + ")";
        movimentosPossiveis[3] = "(" + (getColuna()+2) + "," + (getLinha()+1) + ")";
        //...
        return movimentosPossiveis;
    }

}