package independentWork8.ex1_chessPiece;

public class Pawn extends ChessPiece {

    public Pawn(int column, int row) {
        super(column, row);
    }

    @Override
    public String[] possibleMovements() {
        String[] possibleMovements = new String[2];
        possibleMovements[0] = "(" + getColumn() + "," + getRow() + 1 + ")";
        possibleMovements[0] = "(" + getColumn() + "," + getRow() + 2 + ")";
        return possibleMovements;
    }

}