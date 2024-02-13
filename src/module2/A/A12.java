package module2.A;

public class A12 {
    public static void isPow(int n) {
        int i=0;
        double x = n;
        while (x>1){
            x/=2;
            i++;
        }
        if (x==1){
            System.out.println(i);
        } else
            System.out.println("No");
    }

    public static void main(String[] args) {
        isPow(8192);
    }
}
