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
        board[7][0] = new Rook(new Position(7, 0), Color.BLACK);
        board[7][1] = new Knight(new Position(7, 1), Color.BLACK);
        board[7][2] = new Bishop(new Position(7, 2), Color.BLACK);
        board[7][3] = new Queen(new Position(7, 3), Color.BLACK);
        board[7][4] = new King(new Position(7, 4), Color.BLACK);
        board[7][5] = new Bishop(new Position(7, 5), Color.BLACK);
        board[7][6] = new Knight(new Position(7, 6), Color.BLACK);
        board[7][7] = new Rook(new Position(7, 7), Color.BLACK);


        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(new Position(6, i), Color.BLACK);
        }

    }

    private char getSymbol(Piece piece) {
        char symbol = '.';

        if (piece instanceof Pawn) symbol = 'P';
        else if (piece instanceof Rook) symbol = 'R';
        else if (piece instanceof Knight) symbol = 'N';
        else if (piece instanceof Bishop) symbol = 'B';
        else if (piece instanceof Queen) symbol = 'Q';
        else if (piece instanceof King) symbol = 'K';

        if (piece.getColor() == Color.BLACK) {
            symbol = Character.toLowerCase(symbol);
        }

        return symbol;
    }


    public void printBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int row = 7; row >= 0; row--) {
            System.out.print(row + " ");
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(getSymbol(piece) + " ");
                }
            }
            System.out.println();
        }
    }

    // CHECKING THE PATH FOR ROOK, BISHOP, QUEEN
    public boolean isPathClear(Position from, Position to) {
        // interget.compare: if a > b: 1, a = b: 0, a < b: -1
        // BY THIS WE CHECKING THE DIRECTION OF THE PIECE
        // 1 - FORWARD, -1 - BACK, 0 - NO CHANGES
        int dr = Integer.compare(to.getRow(), from.getRow());
        int dc = Integer.compare(to.getCol(), from.getCol());

        int currentRow = from.getRow() + dr;
        int currentCol = from.getCol() + dc;

        // WHILE WE DONT REACH THE DESTINATION
        while (currentRow != to.getRow() || currentCol != to.getCol()) {
            // CHECKING IF SOME PIECE ON THE PATH
            if (board[currentRow][currentCol] != null) {
                return false;
            }
            currentRow += dr;
            currentCol += dc;
        }

        return true;
    }

    // MOVING PIECE
    public boolean move(Position from, Position to) {
        if (!from.isInsideBoard() || !to.isInsideBoard()) {
            System.out.println("Move is outside the board.");
            return false;
        }

        Piece piece = getPiece(from);

        if (piece == null) {
            System.out.println("No piece at starting position.");
            return false;
        }

        if (!piece.isLegalMove(to)) {
            System.out.println("Illegal move for this piece.");
            return false;
        }

        Piece target = getPiece(to);
        // WE CANT BEAT OUT FIGURE
        if (target != null && target.getColor() == piece.getColor()) {
            System.out.println("You cannot capture your own piece.");
            return false;
        }

        if (piece instanceof Rook || piece instanceof Bishop || piece instanceof Queen) {
            if (!isPathClear(from, to)) {
                System.out.println("Path is blocked.");
                return false;
            }
        }

        if (piece instanceof Pawn) {
            int dr = to.getRow() - from.getRow();
            int dc = to.getCol() - from.getCol();

            // MOVING FORWARD
            if (dc == 0) {
                if (target != null) {
                    System.out.println("Pawn cannot move forward into an occupied square.");
                    return false;
                }

                if (Math.abs(dr) == 2) {
                    int middleRow = (from.getRow() + to.getRow()) / 2;
                    Position middle = new Position(middleRow, from.getCol());

                    if (getPiece(middle) != null) {
                        System.out.println("Pawn cannot jump over a piece.");
                        return false;
                    }
                }
            }

            // CAPTURES DIAGONAL
            if (Math.abs(dc) == 1) {
                if (target == null) {
                    System.out.println("Pawn can move diagonally only when capturing.");
                    return false;
                }

                if (target.getColor() == piece.getColor()) {
                    System.out.println("Pawn cannot capture its own piece.");
                    return false;
                }
            }
        }

        setPiece(to, piece);
        setPiece(from, null);
        piece.setPosition(to);

        return true;
    }
}
