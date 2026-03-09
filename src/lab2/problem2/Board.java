package lab2.problem2;

public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
    }

    public Piece getPiece(Position p) {
        return board[p.getRow()][p.getCol()];
    }

    public void setPiece(Position p, Piece piece) {
        board[p.getRow()][p.getCol()] = piece;
    }

    public boolean isEmpty(Position p) {
        return getPiece(p) == null;
    }


    public void setup() {
        // WHITE PIECES
        board[0][0] = new Rook(new Position(0, 0), Color.WHITE);
        board[0][1] = new Knight(new Position(0, 1), Color.WHITE);
        board[0][2] = new Bishop(new Position(0, 2), Color.WHITE);
        board[0][3] = new Queen(new Position(0, 3), Color.WHITE);
        board[0][4] = new King(new Position(0, 4), Color.WHITE);
        board[0][5] = new Bishop(new Position(0, 5), Color.WHITE);
        board[0][6] = new Knight(new Position(0, 6), Color.WHITE);
        board[0][7] = new Rook(new Position(0, 7), Color.WHITE);


        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1, i), Color.WHITE);
        }

        // BLACK PIECES
        board[7][0] = new Rook(new Position(0, 0), Color.BLACK);
        board[7][1] = new Knight(new Position(0, 1), Color.BLACK);
        board[7][2] = new Bishop(new Position(0, 2), Color.BLACK);
        board[7][3] = new Queen(new Position(0, 3), Color.BLACK);
        board[7][4] = new King(new Position(0, 4), Color.BLACK);
        board[7][5] = new Bishop(new Position(0, 5), Color.BLACK);
        board[7][6] = new Knight(new Position(0, 6), Color.BLACK);
        board[7][7] = new Rook(new Position(0, 7), Color.BLACK);


        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(new Position(6, i), Color.BLACK);
        }


    }


}
