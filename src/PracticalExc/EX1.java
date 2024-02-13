package PracticalExc;

public class EX1 {
    static int right=0,left=0;

    public static void addRight(int n){
        right+=n;
    }

    public static void addLeft(int n){
        left+=n;
    }

    public static String getSituation(){
        if (right>left)
            return "R";
        if (left>right)
            return "L";
        if (right==left)
            return "=";
        return null;
    }

}
