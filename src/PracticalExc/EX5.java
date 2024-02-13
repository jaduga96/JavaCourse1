package PracticalExc;

public class EX5 {
    String name,address,work;
    int age, weight;

    public EX5(String name, int age) {
        this.name = name;
        this.age = age;
        this.address=null;
        this.work=null;
        this.weight=70;
    }

    public EX5(String name, String address) {
        this.name = name;
        this.address = address;
        this.work=null;
        this.weight=70;
        this.age=35;
    }

    public EX5(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address=null;
        this.work=null;
    }

    public EX5(String name, int age, String work) {
        this.name = name;
        this.work = work;
        this.age = age;
        this.address=null;
        this.weight=70;
    }

    public EX5(int age, int weight,String address, String work) {
        this.address = address;
        this.work = work;
        this.age = age;
        this.weight = weight;
        this.name="No Name";
    }
}
