package lab2.problem2;

public class ChessTest {
    public static void main(String[] args) {
        Piece rook = new Rook(new Position(0, 0));
        System.out.println("Rook (0,0)->(0,7): " + rook.isLegalMove(new Position(0, 7))); // true
        System.out.println("Rook (0,0)->(7,7): " + rook.isLegalMove(new Position(7, 7))); // false

        Piece bishop = new Bishop(new Position(2, 0));
        System.out.println("Bishop (2,0)->(5,3): " + bishop.isLegalMove(new Position(5, 3))); // true

        Piece knight = new Knight(new Position(4, 4));
        System.out.println("Knight (4,4)->(6,5): " + knight.isLegalMove(new Position(6, 5))); // true

        Piece king = new King(new Position(4, 4));
        System.out.println("King (4,4)->(5,5): " + king.isLegalMove(new Position(5, 5))); // true

        Piece queen = new Queen(new Position(3, 3));
        System.out.println("Queen (3,3)->(3,0): " + queen.isLegalMove(new Position(3, 0))); // true
        System.out.println("Queen (3,3)->(6,6): " + queen.isLegalMove(new Position(6, 6))); // true

        Piece pawnW = new Pawn(new Position(1, 4), Color.WHITE);
        System.out.println("PawnW (1,4)->(3,4): " + pawnW.isLegalMove(new Position(3, 4))); // true (двойной ход)
    }
}