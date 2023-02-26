/*
*
*   =>  + Lớp Properties trong java được sử dụng để tạo ra đối tượng chứa cặp khóa (key)
*         và giá trị (value) như một chuỗi.
*
*       + Lớp java.util.Properties là một lớp con của Hashtable
*
*   //////////////////////////////////////////////////////////////////////////////////////
*
*   Lợi thế của file properties:
        Không cần biên dịch lại, nếu thông tin được thay đổi từ file .properties:
        * Nếu có bất kỳ thông tin nào được thay đổi từ file .properties, bạn không cần phải biên dịch
        * lại lớp java. Nó được sử dụng để lưu trữ thông tin mà sẽ được thay đổi thường xuyên.
*

* */

package src.java.Collection.Properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Properties_class {
    public static void main(String[] args) throws Exception {
        // get system properties
        Properties properties = System.getProperties();
        Set set = properties.entrySet();
        // show system properties
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
