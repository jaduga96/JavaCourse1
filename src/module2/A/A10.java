package module2.A;

public class A10 {
    public static void checkTriangle(int a, int b, int c) {
        if ((a+b>=c)&(b+c>=a)&(c+a>=b)){
            System.out.println("YES");
        } else System.out.println("NO");
    }

    public static void main(String[] args) {
        checkTriangle(5,1,1);
    }
}
