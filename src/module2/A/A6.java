package module2.A;

public class A6 {
    public static void numbers(int a, int b, int c) {
        int positive = 0,negative=0,equal=0;
        for (int i: new int[]{a, b, c}){
            if (i>0){
                positive++;
                continue;
            }
            if (i<0){
                negative++;
                continue;
            }
            equal++;
        }

        System.out.println("{"+positive+" positive, "+negative+" negative, "+equal+" equal 0}");
    }

    public static void main(String[] args) {
        numbers(0,-0,-0);
    }
}
