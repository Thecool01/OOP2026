package lab2.problem2;

public class Rook extends Piece {
    public Rook(Position a, Color c) {
        super(a, c);
    }


    @Override
    public boolean isLegalMove(Position b) {
        if (!insideBoard(b) || samePosition(b)) return false;
        else return isStraight(b);
        // ROOK CAN MOVE ONLY IN STRAIGHT LINES
    }

}
