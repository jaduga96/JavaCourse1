package PracticalExc.EX11;

public class main {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        board.fieldOut();
        System.out.println(board.makeMove(1, 1));
        board.fieldOut();
        System.out.println(board.makeMove(1, 2));
        board.fieldOut();
        System.out.println(board.makeMove(2, 2));
        board.fieldOut();
        System.out.println(board.makeMove(1, 3));
        board.fieldOut();
        System.out.println(board.makeMove(3, 3));
        board.fieldOut();

    }
}
