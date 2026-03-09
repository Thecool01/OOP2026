package lab2.problem2;

import java.util.Scanner;

public class ChessGameTest {
    public static void main(String[] args) {
        Board board = new Board();
        board.setup();

        Scanner sc = new Scanner(System.in);

        while (true) {
            board.printBoard();

            System.out.println("Enter move: fromRow fromCol toRow toCol");
            System.out.println("Example: 1 0 3 0");
            System.out.println("Type -1 to exit");

            int fromRow = sc.nextInt();
            if (fromRow == -1) break;

            int fromCol = sc.nextInt();
            int toRow = sc.nextInt();
            int toCol = sc.nextInt();

            Position from = new Position(fromRow, fromCol);
            Position to = new Position(toRow, toCol);

            boolean success = board.move(from, to);

            if (success) {
                System.out.println("Move completed.");
            } else {
                System.out.println("Move failed.");
            }
        }

        sc.close();
    }
}