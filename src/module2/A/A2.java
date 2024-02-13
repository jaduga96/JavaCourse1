package module2.A;

public class A2 {
    String name = "";

    public void setName(String n) {
        name=n;
    }

    public static void main(String[] args) {
        A2 turtle = new A2();
        turtle.setName("Arkadiy Ivanovich");
        System.out.println(turtle.name);
    }
}