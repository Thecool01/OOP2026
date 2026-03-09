package lab2.problem2;

public class Pawn extends Piece {

    public Pawn(Position a, Color c) {
        super(a, c);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!insideBoard(b) || samePosition(b)) return false;

        int dr = deltaRow(b);
        int dc = deltaCol(b);

        // WITHOUT GAME RULES: ONLY MOVING FORWARD
        if (dc != 0) return false;

        if (color == Color.WHITE) { // FOR WHITE
            // 1 STEP
            if (dr == 1) return true;
            // 2 STEPS
            return a.getRow() == 1 && dr == 2;
        }
        else {
            // FOR BLACK
            if (dr == -1) return true;
            return a.getRow() == 6 && dr == -2;
        }
    }
}
