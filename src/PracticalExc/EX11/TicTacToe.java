package PracticalExc.EX11;

import java.lang.constant.Constable;

public class TicTacToe {
    String[][] gameTable;
    boolean queue;

    public TicTacToe() {
        newGame();
    }

    public void newGame() {
        gameTable = new String[3][3];
        queue = true;
        for (int i = 0; i < gameTable.length; i++)
            for (int j = 0; j < gameTable.length; j++) {
                gameTable[i][j] = "-";
            }
    }

    public String[][] getField() {
        return gameTable;
    }

    public String checkGame() {
        for (int i = 0; i < gameTable.length; i++) {
            if (gameTable[i][0] == gameTable[i][1] && gameTable[i][1] == gameTable[i][2] && gameTable[i][0] != "-") {
                return gameTable[i][0];
            }
            if (gameTable[0][i] == gameTable[1][i] && gameTable[1][i] == gameTable[2][i] && gameTable[0][i] != "-") {
                return gameTable[0][i];
            }
        }
        if (gameTable[0][0] == gameTable[1][1] && gameTable[1][1] == gameTable[2][2] && gameTable[0][0] != "-") {
            return gameTable[0][0];
        }
        if (gameTable[0][2] == gameTable[1][1] && gameTable[1][1] == gameTable[2][0] && gameTable[0][2] != "-") {
            return gameTable[0][2];
        }
        for (int i = 0; i < gameTable.length; i++)
            for (int j = 0; j < gameTable.length; j++) {
                if (gameTable[i][j] == "-") {
                    return null;
                }
            }
        return "D";
    }

    public String makeMove(int x, int y) {
        if (checkGame() != null) {
            return "Game was ended";
        }
        if (gameTable[x - 1][y - 1] != "-") {
            return "Cell " + x + ", " + y + " is already occupied";
        }
        if (queue) {
            gameTable[x - 1][y - 1] = "X";
        } else gameTable[x - 1][y - 1] = "0";
        queue = !queue;
        String result = checkGame();
        if (checkGame() != null) {
            switch (checkGame()) {
                case "X":
                    return "Player X won";
                case "0":
                    return "Player 0 won";
                case "D":
                    return "Draw";
                default:
                    return "Move completed";
            }
        }
        return "Move completed";
    }

    public void fieldOut() {
        System.out.println("['" + gameTable[0][0] + "', '" + gameTable[0][1] + "', '" + gameTable[0][2] + "']");
        System.out.println("['" + gameTable[1][0] + "', '" + gameTable[1][1] + "', '" + gameTable[1][2] + "']");
        System.out.println("['" + gameTable[2][0] + "', '" + gameTable[2][1] + "', '" + gameTable[2][2] + "']");
    }


}
