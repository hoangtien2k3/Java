package Java_8.Method_References;

import java.util.Arrays;
import java.util.List;

class MathUtil {
    public static double powerOfTwo(double num) {
        return Math.pow(num, 2);
    }
}

public class Reference_static_method {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        // map nhận method reference
        numbers.stream().map(MathUtil::powerOfTwo).forEach(System.out::println);

        System.out.println("\nCách Khác");

        // map nhận lambda expression
        numbers.stream().map(num -> MathUtil.powerOfTwo(num)).forEach(System.out::println);

    }
}