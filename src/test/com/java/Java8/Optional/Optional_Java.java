/*
    Optional trong Java:

    Optional là một lớp được giới thiệu trong Java 8, cho phép đại diện cho giá trị có hoặc không có.
    Optional cung cấp các phương thức để kiểm tra xem giá trị có tồn tại hay không trước khi truy cập
    vào giá trị đó. Điều này giúp giảm thiểu các lỗi NullPointerException trong mã Java.


    + Mục đích của Optional trong Java là giải quyết vấn đề NullPointerException (NPE) trong mã Java.

*/


package src.test.com.java.Java8.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person {
    private String name;
    public String getName() {
        return name;
    }


}

public class Optional_Java {
    public static void main(String[] args) {
        Person person = new Person();
        Optional<String> nameOptional = Optional.ofNullable(person.getName());
        if (nameOptional.isPresent()) { // kiểu tra xem giá trị trả về có null hay không
            String name = nameOptional.get();
        } else {
            System.out.println("Name: NULL" ); // trường hợp không có giá trị name.
        }



        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 4, 6);
        Optional<Integer> found = list.stream().filter(p -> p > 8).findFirst();
        if (found.isPresent()) {
            System.out.println("Gía trị đầu tiên > 8 !!!");
        } else {
            System.out.println("giá trị đầu tiên không lớn hơn 8 ( < 8) !!!!");
        }


    }
}
