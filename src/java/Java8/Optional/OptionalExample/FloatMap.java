package src.java.Java8.Optional.OptionalExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FloatMap {
    public static void main(String[] args) {

        // float in Optional java 8


        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(myList);


        List<String> mylist1 = Arrays.asList("a", "b", "c")
                        .stream()
                                .map(p -> p.toUpperCase())
                                        .collect(Collectors.toList());
        System.out.println(mylist1);


        List<List<String>> listLastMap = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b")
        );
        System.out.println(listLastMap
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
        );


        List<String> words= Arrays.asList("JavaDevJournal", "Java");
        words.stream()
                .map(p -> p.split(""))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(words);


        List < String > words1 = Arrays.asList("JavaDevJournal", "Java");
        List < String > unique = words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(words1);

    }
}
