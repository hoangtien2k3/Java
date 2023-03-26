package src.java.Java8.Optional.OptionalExample;


import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str1 = "Optional Example.";
        String str2 = null;

        // Tạo Optional từ một giá trị có thể null (
        Optional<String> optionalStr1 = Optional.ofNullable(str1);
        Optional<String> optionalStr2 = Optional.ofNullable(str2);

        // Kiểm tra giá trị trong Optional có tồn tại hay không
        if (optionalStr1.isPresent()) {
            System.out.println(optionalStr1.get());
        } else {
            System.out.println("Giá trị trong Optional rỗng!");
        }

        // Sử dụng phương thức orElseGet để trả về một giá trị mặc định nếu giá trị trong Optional không tồn tại
        String defaultStr = optionalStr2.orElseGet(() -> "Giá trị mặc định");
        System.out.println(defaultStr);

        // Sử dụng phương thức map để ánh xạ một giá trị từ kiểu này sang kiểu khác
        Optional<Integer> optionalInt = optionalStr1.map(String::length);
        if (optionalInt.isPresent()) {
            System.out.println(optionalInt.get());
        } else {
            System.out.println("Giá trị trong Optional rỗng!");
        }
    }
}
