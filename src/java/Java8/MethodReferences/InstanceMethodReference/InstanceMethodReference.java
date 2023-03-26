package src.java.Java8.MethodReferences.InstanceMethodReference;

import java.util.Arrays;
import java.util.List;

class StringUtil {
    public int length(String s) {
        return s.length();
    }
}

public class InstanceMethodReference {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        List<String> strings = Arrays.asList("helloworld", "world");
        strings.stream()
                .map(stringUtil::length)
                .forEach(System.out::println);

    }
}
