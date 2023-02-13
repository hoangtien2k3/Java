/*
    Lambda với Filter Collection Data:

    Mục đích của filter collection trong Java là để lọc các phần tử trong một collection theo một
    tiêu chí cụ thể. Việc lọc này có thể được thực hiện bằng cách sử dụng một bộ lọc, thường được
    biểu diễn bằng một điều kiện hoặc bộ so sánh. Kết quả của việc lọc là một collection mới chứa
    các phần tử đạt tiêu chuẩn được xác định. Filter collection rất hữu ích trong nhiều tình huống,
    như tìm kiếm các phần tử theo tiêu chuẩn, hoặc lọc các phần tử không cần thiết để tối ưu hóa
    tốc độ tải dữ liệu.

*/

package Java_8.Lambda_Expression.Lambda_Filter_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

public class filter_collection {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30, 5000));
        employees.add(new Employee("Jane Doe", 25, 6000));
        employees.add(new Employee("Jim Smith", 40, 4000));
        employees.add(new Employee("Emily Brown", 35, 7000));


        System.out.println("Employees with salary greater than 5000: ");
        employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .forEach(e -> System.out.println("\t" + e.getName() + ": " + e.getSalary()));



        /*
        *   Sử dụng
        *
        **/

        System.out.println("\nEmployees with salary less 6000: ");
        Stream<Employee> filter_date = employees.stream().filter(p -> p.getSalary() < 6000);
        filter_date.forEach(p -> {
            System.out.println("\t" + p.getName() + ": " + p.getSalary());
        });




//        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 4, 6);
//        List<Integer> evenNumbers = numbers1.stream()
//                .filter(x -> x % 2 == 0)
//                .distinct()
//                .limit(2)
//                .collect(Collectors.toList());



//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        int sum = numbers.stream()
//                .filter(x -> x % 2 == 0)
//                .mapToInt(x -> x)
//                .sum();
//
//        System.out.println("Sum: " + sum);


    }
}

