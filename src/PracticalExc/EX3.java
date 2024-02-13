package PracticalExc;

public class EX3 {
    String surname;
    String name;
    String address;
    String cardNumber;

    public EX3(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }


    public String toString() {
        return "Payer: "+
                "surname " + surname +
                ", name " + name +
                ", address " + address +
                ", cardNumber " + cardNumber;
    }
}
