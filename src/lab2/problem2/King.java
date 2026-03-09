package lab2.problem2;

public class King extends Piece {
    public King(Position a, Color c) {
        super(a, c);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!insideBoard(b) || samePosition(b)) return false;
        else return absoluteDeltaRow(b) <= 1 && absoluteDeltaRow(b) <= 1;
        // KING CAN MOVE ONLY BY 1 CELL IN DIFFERENT DIRECTIONS
    }


}
