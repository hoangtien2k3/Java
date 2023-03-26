package src.java.Java8.MethodReferences.StaticMethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class MathUtil {
    public static double powerOfTwo(double num) {
        return Math.pow(num, 2);
    }
}


public class StaticMethodReference {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        // method reference
        numbers.stream()
                .map(MathUtil::powerOfTwo)
                .forEach(System.out::println);

        System.out.println("\n");

        // Lambda expression
        numbers.stream()
                .map(num -> MathUtil.powerOfTwo(num))
                .forEach(e -> System.out.println(e));

    }
}