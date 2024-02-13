package module2.A;

public class A14 {
    public static void findFactorial(int n) {
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        findFactorial(5);
    }
}
