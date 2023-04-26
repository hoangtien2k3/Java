package src.java.Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        Stream<String> stringStream = stream
                .map((value) -> {
                    return value.toLowerCase();
                });

        stringStream.forEach(p -> {
            System.out.print(p + " ");
        });



    }
}
