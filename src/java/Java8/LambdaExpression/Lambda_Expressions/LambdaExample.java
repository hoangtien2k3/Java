package src.java.Java8.LambdaExpression.Lambda_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Functional interface
@FunctionalInterface
interface EmployeeFilter {
    List<Employee> filter(List<Employee> employees, Predicate<Employee> condition);
}

public class LambdaExample {
    public static void main(String[] args) {

        // Sử dụng anonymous class
        EmployeeFilter anonymousFilter = new EmployeeFilter() {
            @Override
            public List<Employee> filter(List<Employee> employees, Predicate<Employee> condition) {
                List<Employee> result = new ArrayList<>();
                for (Employee e : employees) {
                    if (condition.test(e)) {
                        result.add(e);
                    }
                }
                return result;
            }
        };

        // Sử dụng biểu thức lambda
        EmployeeFilter lambdaFilter = (employees, condition) -> {
            List<Employee> result = new ArrayList<>();
            for (Employee e : employees) {
                if (condition.test(e)) {
                    result.add(e);
                }
            }
            return result;
        };

        Consumer<Integer> consumer = (Integer a) -> System.out.println(a);
        consumer.accept(100);
    }
}


