package lab2.problem2;

public class Bishop extends Piece{
    public Bishop(Position a, Color c) {
        super(a, c);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!insideBoard(b) || samePosition(b)) return false;
        else return isDiagonal(b);
        // BISHOP CAN MOVE ONLY IN DIAGONAL LINES
    }


}
