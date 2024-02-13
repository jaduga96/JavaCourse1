package module2.A;

public class A3 {
    public static void max(int a, int b, int c, int d) {
        int max=a;
        for(int i: new int[]{b, c, d}){
            if (max<i)
                max=i;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        max(1,8,-9,5);
    }
}
