package lab2.problem2;

public class Position {
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


    public boolean isInsideBoard() {
        return row >= 0 && row <= 7 && col >= 0 && col <= 7;
    }

    @Override
    public String toString() {
        return ("The position of the Piece is " + row + ", " + col);
    }
}
