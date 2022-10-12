package independentWork8.ex1_chessPiece;

public abstract class ChessPiece {

    private int column;
    private int row;

    public ChessPiece(int column, int row) {
        this.column = column;
        this.row = row;
    }

    @Override
    public String toString() {
        String chessColumn = "";
        switch (column) {
            case 1:
                chessColumn = "A";
                break;
            case 2:
                chessColumn = "B";
                break;
            case 3:
                chessColumn = "C";
                break;
            case 4:
                chessColumn = "D";
                break;
            case 5:
                chessColumn = "E";
                break;
            case 6:
                chessColumn = "F";
                break;
            case 7:
                chessColumn = "G";
                break;
            case 8:
                chessColumn = "H";
                break;
        }
        return "(" + chessColumn + row + ")";
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public abstract String[] possibleMovements();

}