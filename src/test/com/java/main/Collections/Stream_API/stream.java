package src.test.com.java.main.Collections.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        int sum = numbers.stream()
                .filter(number -> number > 10)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);

        // VD khác
        List<Integer> numbers_1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers_1.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);


    }
}
