package module2.A;

public class A4 {
    public static void findQuarter(int x, int y) {
        if (x>0){
            if (y>0){
                System.out.println("Точка лежит в 1 четверти");
            } else
                System.out.println("Точка лежит в 4 четверти");
        } else {
            if (y>0){
                System.out.println("Точка лежит во 2 четверти");
            } else
                System.out.println("Точка лежит в 3 четверти");
        }

    }

    public static void main(String[] args) {
        findQuarter(1,-1);

    }
}
