package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position a, Color c) {
        super(a, c);
    }

    public boolean isLegalMove(Position b) {
        if (!insideBoard(b) || samePosition(b)) return false;
        else return isStraight(b) || isDiagonal(b); // QUEEN CAN MOVE STRAIGHT OR IN DIAGONAL
    }

}
