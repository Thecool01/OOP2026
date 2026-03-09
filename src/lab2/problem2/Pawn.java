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

        if (color == Color.WHITE) {
            if (dr == 1 && dc == 0) return true;
            if (a.getRow() == 1 && dr == 2 && dc == 0) return true;
            if (dr == 1 && Math.abs(dc) == 1) return true;
        } else {
            if (dr == -1 && dc == 0) return true;
            if (a.getRow() == 6 && dr == -2 && dc == 0) return true;
            if (dr == -1 && Math.abs(dc) == 1) return true;
        }

        return false;
    }
}
