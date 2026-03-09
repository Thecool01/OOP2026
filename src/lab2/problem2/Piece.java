package lab2.problem2;


public abstract class Piece {

    protected Position a;
    protected Color color;

    public Piece (Position a, Color color) {
        this.a = a;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


    // POSITION MOVING
    protected int deltaRow(Position b) {
        return b.getRow() - this.a.getRow();
    }

    protected int deltaCol(Position b) {
        return b.getCol() - this.a.getCol();
    }

    protected int absoluteDeltaRow(Position b) {
        return Math.abs(deltaRow(b));
    }

    protected int absoluteDeltaCol(Position b) {
        return Math.abs(deltaCol(b));
    }

    // CHECKING
    protected boolean samePosition(Position b) {
        return deltaCol(b) == 0 && deltaRow(b) == 0;
    }

    protected boolean insideBoard(Position b) {
        return b!= null && b.isInsideBoard() && a!= null && a.isInsideBoard();
    }

    // MOVING IN STRAIGHT LINES OR DIAGONAL

    protected boolean isStraight(Position b) {
        return (deltaRow(b) == 0 && deltaCol(b) != 0) || (deltaRow(b) != 0 && deltaCol(b) == 0);
    }

    protected boolean isDiagonal(Position b) {
        return (absoluteDeltaCol(b) == absoluteDeltaRow(b) && !samePosition(b));
    }

    public abstract boolean isLegalMove(Position b);

    public void setPosition(Position a) {
        this.a = a;
    }
}

