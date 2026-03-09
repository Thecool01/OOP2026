package lab2.problem2;

public class Knight extends Piece {
    public Knight(Position a, Color c) {
        super(a, c);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!insideBoard(b) || samePosition(b)) return false;

        else {
            return (absoluteDeltaRow(b) == 2 && absoluteDeltaCol(b) == 1) ||
                    absoluteDeltaRow(b) == 1 && absoluteDeltaCol(b) == 2;
            // KNIGHT CAN MOVE ONLY IN AN L-shape -
            // FOR EXAMPLE: UP BY 2 AND LEFT BY 1, etc.
        }
    }
}
