package module2.A;

public class A13 {
    public static void cube(int n) {
        for (int i=0;i<n+1;i++){
            System.out.println("The cube of "+i+" is equal to "+(i*i*i));
        }
    }

    public static void main(String[] args) {
        cube(10);
    }
}
