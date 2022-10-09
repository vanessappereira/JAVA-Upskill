package independentWork8.ex1_chessPiece;

public class knight extends chessPiece {

    public knight(int column, int row) {
        super(column, row);
    }

    @Override
    public String[] possibleMovements() {
        String[] possibleMovements = new String[8];
        possibleMovements[0] = "(" + (getColumn() + 1) + "," + (getRow() + 2) + ")";
        possibleMovements[1] = "(" + (getColumn() - 1) + "," + (getRow() + 2) + ")";
        possibleMovements[2] = "(" + (getColumn() - 2) + "," + (getRow() + 1) + ")";
        possibleMovements[3] = "(" + (getColumn() + 2) + "," + (getRow() + 1) + ")";
        return possibleMovements;
    }

}