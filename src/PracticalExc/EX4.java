package PracticalExc;

public class EX4 {
    private String name;
    private int age;

    public EX4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String bark(){
        return "woof";
    }
}
