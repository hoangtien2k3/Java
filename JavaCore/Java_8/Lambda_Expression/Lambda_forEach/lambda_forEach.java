package JavaCore.Java_8.Lambda_Expression.Lambda_forEach;

import java.util.ArrayList;
import java.util.List;

public class lambda_forEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("Python");


        // cách viết chi tiết, tường minh hơn
        list.forEach((element) -> {
            System.out.print(element + "\t");
        });

        // cách viết ngắn gọn hơn.
        list.forEach(elements -> System.out.print(elements + "\t"));

    }
}
