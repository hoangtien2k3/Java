package src.java.Java8.MethodReferences;

import java.util.Arrays;
import java.util.List;

class StringUtil {
    public int length(String s) {
        return s.length();
    }
}

public class Reference_method_instance {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        List<String> strings = Arrays.asList("hello", "world");
        strings.stream().map(stringUtil::length).forEach(System.out::println);
    }
}
