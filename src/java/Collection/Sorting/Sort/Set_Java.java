/*
    => Chúng ta phải sử dụng LinkedHashSet để có thể giữ được thứ tự các phần tử trong một tập hợp.


    Lớp tiện ích Collections chỉ hỗ trợ sắp xếp các phần tử trong một List. Do đó, để có thể
    sắp xếp được một Set chúng ta cần chuyển một Set qua một List, sau đó thực hiện sắp xếp
    danh sách này và cuối cùng thực hiện chuyển List về Set.


* */


package src.java.Collection.Sorting.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_Java {
    public static final List<Integer> NUMBERS = Arrays.asList( 5, 1, 2, 4, 3, 6, 7, 9, 8 );

    public static void main(String[] args) {
        // Original data
        Set<Integer> set1 = new LinkedHashSet<>(NUMBERS);

        // Convert Set to List
        List<Integer> list1 = new ArrayList<>(set1);

        // Sorting a List
        Collections.sort(list1);

        // Convert List to Set
        set1 = new LinkedHashSet<>(list1);
        System.out.println(set1);
        // => [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}