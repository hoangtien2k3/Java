/*
 * Association:
 *   - Liên kết (Association) là mối quan hệ giữa hai lớp riêng biệt được
 *     thiết lập thông qua các Đối tượng của chúng.
 *   - Liên kết có thể là một-một, một-nhiều, nhiều-một, nhiều-nhiều.
 *
 *   + Trong lập trình hướng đối tượng, một đối tượng giao tiếp với các đối tượng
 *     khác để sử dụng chức năng và dịch vụ được cung cấp bởi đối tượng đó.
 *   + Hợp thành (Conposition) và kết tập (Aggregation) là hai hình thức liên kết.
 *
 * */

package src.java.JavaCore.OOP.JavaOOPs.Inheritance.Association_Java;

import static java.lang.System.out;

class Bank {
    private String name;

    // bank name
    Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }

}

// employee class
class Employee {
    private String name;

    // employee name
    Employee(String name) {
        this.name = name;
    }
    public String getEmployeeName() {
        return this.name;
    }
}

public class association {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("Neha");
        out.println();
        out.println(emp.getEmployeeName() + " - is employee of - " + bank.getBankName());
    }
}
