package module2.A;

public class A5 {
    public static void checkDay(int number) {
        switch (number){
            case 1:
                System.out.println("Monday");
                return;
            case 2:
                System.out.println("Tuesday");
                return;
            case 3:
                System.out.println("Wednesday");
                return;
            case 4:
                System.out.println("Thursday");
                return;
            case 5:
                System.out.println("Friday");
                return;
            case 6:
                System.out.println("Saturday");
                return;
            case 7:
                System.out.println("Sunday");
                return;
            default:
                System.out.println("Whats going on????");
        }
    }

    public static void main(String[] args) {
        checkDay(8);
    }
}
