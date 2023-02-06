package IndependentWork8.E1Xadrez;

public abstract class pecaDeXadrez {

    private int coluna;
    private int linha;

    public pecaDeXadrez(int coluna, int linha){
        this.coluna = coluna;
        this.linha = linha;
    }

    @Override
    public String toString() {
        String colunaXadrez = "";
        switch (coluna) {
            case 1:
                colunaXadrez = "A";
                break;
            case 2:
                colunaXadrez = "B";
                break;
            case 3:
                colunaXadrez = "C";
                break;
            case 4:
                colunaXadrez = "D";
                break;
            case 5:
                colunaXadrez = "E";
                break;
            case 6:
                colunaXadrez = "F";
                break;
            case 7:
                colunaXadrez = "G";
                break;
            case 8:
                colunaXadrez = "H";
                break;
        }
        return "(" + colunaXadrez + linha + ")";
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    public abstract String[] movimentosPossiveis();

}