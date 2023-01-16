package src.Test_Interface_AbstractClass;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}