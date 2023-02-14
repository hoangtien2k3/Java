/*
    Lambda với Filter Collection Data:

    Mục đích của filter collection trong Java là để lọc các phần tử trong một collection theo một
    tiêu chí cụ thể. Việc lọc này có thể được thực hiện bằng cách sử dụng một bộ lọc, thường được
    biểu diễn bằng một điều kiện hoặc bộ so sánh. Kết quả của việc lọc là một collection mới chứa
    các phần tử đạt tiêu chuẩn được xác định. Filter collection rất hữu ích trong nhiều tình huống,
    như tìm kiếm các phần tử theo tiêu chuẩn, hoặc lọc các phần tử không cần thiết để tối ưu hóa
    tốc độ tải dữ liệu.

*/

package src.java.Java8.LambdaExpression.Lambda_Filter_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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


        //
        System.out.println("Employees with salary greater than 5000: ");
        employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .forEach(e -> System.out.println("\t" + e.getName() + ": " + e.getSalary()));



        //
        System.out.println("\nEmployees with salary less 6000: ");
        Stream<Employee> filter_date = employees.stream().filter(p -> p.getSalary() < 6000);
        filter_date.forEach(p -> {
            System.out.println("\t" + p.getName() + ": " + p.getSalary());
        });




        // Optional findFirst trong Java Optional
        System.out.println("\nOptional 'findFirst' trong Java Optional");
        Optional<Employee> salaryOptional = employees.stream().filter(p -> p.getSalary() > 8000).findFirst();
        if (salaryOptional.isPresent()) {
            System.out.println(salaryOptional.get().toString());
        } else {
            System.out.println("Gia trị la NULL nên không thể tính toán với giá trị đó !!!");
        }





        //
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 4, 6);


        List<Integer> evenNumbers = numbers1.stream()
                .filter(x -> x % 2 == 0)
                .distinct()     // lấy ra giá trị duy nhất trong danh sách. không lấy giá trị trùng lặp
                .limit(2)
                .collect(Collectors.toList());

        System.out.println("\nGía trị duy nhất % 2 trong list: " + evenNumbers);




        int sum = numbers1.stream()
                .filter(x -> x % 2 == 0)    // lọc ra cách phần tử (x % 2) trong danh sách.
                .mapToInt(x -> x) // chuyển đổi các phần tử của Stream thành kiểu số nguyên Int
                .sum();     // tính tổng tất cả các phần tử tong danh sách
        System.out.println("Sum: " + sum);




        Integer sum1 = numbers1.stream().reduce((a, b) -> a + b).get();
        System.out.println("\nSum Full: " + sum1);



    }
}

