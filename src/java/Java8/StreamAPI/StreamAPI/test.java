package src.java.Java8.StreamAPI.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private String age;
    private String address;

    public Student(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


public class test {

    public static boolean checkAnyMatch()
    {
        List<Integer> numbers = Arrays.asList(1, 2, 23, 4, 7, 61, 72, 88);
        System.out.println("---------- Input -----------");
        System.out.println(numbers);
        return numbers.stream().anyMatch(t -> t > 10);
    }

    public static boolean checkAllMatch()
    {
        List<Integer> numbers = Arrays.asList(11, 12, 23, 44, 57, 61, 72, 88);
        System.out.println("---------- Input -----------");
        System.out.println(numbers);
        return numbers.stream().allMatch(t -> t > 10);
    }

    public static boolean checkNoneMatch()
    {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 4, 7, 6, 9, 8);
        System.out.println("---------- Input -----------");
        System.out.println(numbers);
        return numbers.stream().noneMatch(t -> t > 10);
    }



    // findFirst:
    public static void testFindFirst()
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .filter(t -> t > 4)
                .findFirst()
                .ifPresent(System.out::println);
    }


    // findAny:
    public static void testFindAny()
    {
        List<Integer> numbers = Arrays.asList(1, 8, 3, 6, 4, 7, 0, 2);
        numbers.stream()
                .filter(t -> t > 4)
                .findAny()
                .ifPresent(System.out::println);
    }


    public static void main(String[] args) {
//        1.
//        List<Student> studentList = new ArrayList<>();
//        Student s1 = new Student("Tiến", "19", "Thanh Hóa");
//        Student s2 = new Student("Khôi", "21", "Nghệ An");
//        Student s3 = new Student("Tiến", "26", "Hà Tĩnh");
//        Student s4 = new Student("Hiển", "13", "Hải Phòng");
//        studentList = Arrays.asList(s1, s2, s3, s4);
//        // đùng filter lọc ra các sinh viên có tên là Tiến
//        studentList.stream().filter(t -> t.getName().equals("Tiến")).forEach(t -> System.out.println(t));


//        2.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 10);
//        // dùng distinct để đưa về các phần tử duy nhất không trùng lặp.
//        List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());
//        System.out.println("Result of distinct: " + result);





        // 3. limit(n):  trả về 1 stream với số lượng phần tử tối đa là n phần tử.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> result1 = numbers
//                .stream()
//                .distinct()
//                .filter((i) -> {
//                    System.out.println("Filter: " + i);
//                    return i > 4;
//                })
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println("Result of limit: " + result1);




        // 4. skip(n): loại bỏ n phần tử khỏi stream()
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> results = numbers.stream().filter(i -> {
//            System.out.println("Filter: " + i);
//            return i > 4;
//        }).skip(2) //  5, 6, 7, 8, 9 -> 7, 8, 9 (vì nó skip(2), là loại bỏ 2 phần tử 5, 6)
//                .collect(Collectors.toList());
//        System.out.println("Result of skip: " + results);


        // 5. Matching
//        test.checkAnyMatch();
//        test.checkAllMatch();
//        test.checkNoneMatch();



        // 6. findFirst - findAny
//        test.testFindFirst();
//        test.testFindAny();



        // 7. Mapping
//        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
//        List<Integer> wordLengths =
//                words.stream()
//                        .map(String::length)
//                        .collect(Collectors.toList());
//        System.out.println(words);
//        System.out.println(wordLengths);
//        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
//        List<Integer> integerList = stringList.stream().map(Integer::valueOf).collect(Collectors.toList());
//        System.out.println(integerList);



        // 8. Reduce:
        List<Integer> numbers = Arrays.asList(1, 2, 23, 4, 7, 61, 72, 88);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all list: " + sum);
        System.out.println("Sum2 of all list: " + sum2);

    }
}
