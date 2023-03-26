package src.java.Java8.MethodReferences.ConstructorMethodReference;

import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

public class ContructorMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jim");
        names.stream()
                .map(name -> new Person(name, 0))
                .forEach(person -> System.out.println(person.getName()));

    }
}
