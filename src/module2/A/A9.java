package module2.A;

public class A9 {
    public static void findMedian(int a, int b, int c) {
        if (b == a & b == c) {
            System.out.println(b);
        } else {
            if (b >= a & b <= c) {
                System.out.println(b);
            }
            if (b <= a & b <= c) {
                if (a <= c)
                    System.out.println(a);
                else
                    System.out.println(c);
            }
            if (b >= a & b >= c) {
                if (a >= c)
                    System.out.println(a);
                else
                    System.out.println(c);

            }
        }
    }

    public static void main(String[] args) {
        findMedian(2,2,2);
    }
}
