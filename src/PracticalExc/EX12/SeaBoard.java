package PracticalExc.EX12;

public class SeaBoard {

    private String[][] field = new String[10][10];

    public SeaBoard() {
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field.length; j++) {
                field[i][j] = ".";
            }
    }

    public SeaBoard(String[][] field) {
        this.field = field;
    }

    public String[][] getField() {
        return field;
    }

    public void shoot(int line, int columm, String issue) {
        System.out.println(".shoot("+line+","+columm+" ,"+issue+")");
        switch (issue) {
            case "m":
                field[line][columm] = "#";
                break;
            case "h":
                field[line][columm] = "x";
                break;
            case "d":
                field[line][columm] = "x";
                int index = line, coef = -1;
                if (line != 0 && line != 9 && columm != 0 && columm != 9) {
                    if (field[line - 1][columm] == "x" || field[line + 1][columm] == "x") {
                        while (index < 10) {
                            if (field[index][columm]=="x"){
                                field[index][columm - 1] = "#";
                                field[index][columm + 1] = "#";
                            }
                            if (index == 0 || (index!=9&&field[index + coef][columm] != "x")) {
                                if (index!=0&&index!=9) {
                                    field[index + coef][columm] = "#";
                                    field[index + coef][columm-1] = "#";
                                    field[index + coef][columm+1] = "#";
                                }
                                coef *= -1;
                                index = line-1;
                                if (coef==-1) index=100;
                            }

                            index += coef;
                        }
                    }  /*proverka po verticali*/
                    index = columm; coef=-1;
                    if (field[line][columm - 1] == "x" || field[line][columm + 1] == "x") {
                        while (index < 10) {
                            if (field[line][index]=="x"){
                                field[line - 1][index] = "#";
                                field[line + 1][index] = "#";
                            }
                            if (index == 0 || field[line][index+coef] != "x") {
                                if (index!=0) {
                                    field[line][index+coef] = "#";
                                    field[line+1][index+coef] = "#";
                                    field[line-1][index+coef] = "#";
                                }
                                coef *= -1;
                                index = columm-1;
                                if (coef==-1) index=100;
                            }
                            index += coef;
                        }
                    }  /*proverka po horizontali*/

                    if (field[line][columm - 1] != "x" && field[line][columm + 1] != "x" && field[line - 1][columm] != "x" && field[line + 1][columm] != "x") {
                        field[line][columm - 1] = "#";
                        field[line][columm + 1] = "#";
                        field[line - 1][columm] = "#";
                        field[line + 1][columm] = "#";

                        field[line + 1][columm+1] = "#";
                        field[line + 1][columm-1] = "#";
                        field[line - 1][columm+1] = "#";
                        field[line - 1][columm-1] = "#";
                    }
                }
                if (line == 0 || line == 9){
                    int maxmin;
                    if (line==0){
                        coef=1;
                        maxmin=9;
                    } else {
                        coef=-1;
                        maxmin=0;
                    }
                    for (int i=line;i!=maxmin;i+=coef){
                        if (field[i][columm]=="x"){
                            if (columm!=0) field[i][columm-1]="#";
                            if (columm!=9) field[i][columm+1]="#";
                            if (field[i+coef][columm]!="x") field[i+coef][columm]="#";
                        }
                    }
                }
                if ((columm == 0 || columm == 9)&&line!=0&&line!=9){
                    int maxmin;
                    if (columm==0){
                        coef=1;
                        maxmin=9;
                    } else {
                        coef=-1;
                        maxmin=0;
                    }
                    for (int i=columm;i!=maxmin;i+=coef){
                        if (field[line][i]=="x"){
                            if (line!=0) field[line-1][i]="#";
                            if (line!=9) field[line+1][i]="#";
                            if (field[line][i+coef]!="x") field[line][i+coef]="#";
                        }
                    }
                }
        }

    }

    public String check(int line, int columm){
        System.out.println(line+" "+columm);
        switch (field[line][columm]){
            case ".":
                return field[line][columm];
            case "#":
                return field[line][columm];
            case "x":
                return field[line][columm];
            default:
                return null;
        }
    }
    public void fieldOut() {
        for (int i=0;i<field.length;i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.printf(field[i][j]+" ");
            }
            System.out.printf("\n");
        }
        System.out.println("\n");
    }

}
