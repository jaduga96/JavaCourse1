package module2.A;

public class A11 {
    public static void print(int m, int n) {
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("8");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        print(4,8);
    }
}
