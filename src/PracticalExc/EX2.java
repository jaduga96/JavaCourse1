package PracticalExc;

public class EX2 {
    static boolean x=true;
    public static void sound(){
        if (x) {
            System.out.println("ding");
        } else
            System.out.println("dong");
        x=!x;
    }
}
