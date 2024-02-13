package PracticalExc.EX12;

public class main {
    public static void main(String[] args) {
        SeaBoard board = new SeaBoard();
        board.shoot(2,0,"h");
        board.shoot(2,8,"d");
        board.shoot(6,9 ,"h");
        board.shoot(2,2, "m");
        board.shoot(0,0, "m");
        board.shoot(5,2, "m");
        board.shoot(7,0, "h");
        board.shoot(7,1, "h");
        board.shoot(7,2, "h");
        board.shoot(7,3, "d");
        board.shoot(9,7, "h");
        board.shoot(8,7, "d");


        board.fieldOut();




    }

}
