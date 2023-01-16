package src.Bai3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("TIEN", "THANH HOA") {
            @Override
            public void display() {
                System.out.println("HOANG ANH TIEN");
            }
        };
        Employee employee = new Employee("Chung", "T.H", 1500);
        employee.display();

        Customer customer = new Customer("Hang", "Thanh.Hoa", 12);
        customer.display();
    }
}
