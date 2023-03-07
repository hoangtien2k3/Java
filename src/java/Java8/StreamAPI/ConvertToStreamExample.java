package src.java.Java8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ConvertToStreamExample {

    // Generate Streams from Arrays using .stream or Stream.of
    public static void streamFromArray() {
        String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };

        // Get Stream using the Arrays.stream
        Stream<String> testStream1 = Arrays.stream(languages);
        testStream1.forEach(x -> System.out.println(x));

        // Get Stream using the Stream.of
        Stream<String> testStream2 = Stream.of(languages);
        testStream2.forEach(x -> System.out.println(x));
    }

    // Generate Streams from Collections
    public static void streamFromCollection() {
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");

        items.stream().forEach(item -> System.out.println(item));

        items.stream().forEach(e-> {
            System.out.println(e);
        });

        // hai cách trên đều giống nhau,  một cái ko có khối và một cái tạo thành khối.
    }


    // Generate Streams using Stream.generate()
    public static void streamUsingGenerate() {
        //  generate() là một phương thức tĩnh (static method) sử dụng để tạo ra một Stream vô hạn (unbounded stream)
        Stream<String> stream = Stream.generate(() -> "gpcoder").limit(3);

        // toArray(): dùng đổi Stream đó thành một mảng String[].
        String[] testStrArr = stream.toArray(String[]::new);
        // việc sử dụng method reference( String[]::new tương tự như lambda expression () -> new String[length] )
        // String[] testStrArr = stream.toArray(length -> new String[length]);

        System.out.println(Arrays.toString(testStrArr)); // [gpcoder, gpcoder, gpcoder]
    }


    // Generate Streams using Stream.iterate()
    public static void streamUsingIterate() {
        Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
        iterateNumbers.forEach(System.out::print); // 12345
    }


    // Generate Streams from APIs like Regex
    public static void streamUsingRegex() {
        String str = "Welcome,to,gpcoder";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::print);// Welcometogpcoder
    }

    public static void main(String[] args) {
        streamFromArray();
        System.out.println();

        streamUsingGenerate();



    }


}