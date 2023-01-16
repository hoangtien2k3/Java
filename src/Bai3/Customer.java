package src.Bai3;

public class Customer extends Person {
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: " + super.getName());
        System.out.println("Customer address: " + super.getAddress());
        System.out.println("Customer balance: " + balance);
    }
}