package src.Bai2;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}
