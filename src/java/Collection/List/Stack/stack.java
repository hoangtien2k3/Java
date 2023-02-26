/*
    1   boolean empty()
            Kiểm tra nếu Stack này là trống. Trả về true nếu nó trống và false nếu stack chứa các phần tử

    2	Object peek( )
            Trả về phần tử trên cùng của Stack, nhưng không gỡ bỏ nó

    3	Object pop( )
            Trả về phần tử trên cùng của Stack, gỡ bỏ nó

    4	Object push(Object element)
            Đẩy phần tử lên trên cùng của Stack. Cũng trả về phần tử đó

    5	int search(Object element)
            Tìm kiếm phần tử trong Stack. Nếu tìm thấy, offset của nó từ trên cùng của Stack được trả về.
            Nếu không, nó trả về -1
    *
*
* */

package src.java.Collection.List.Stack;

import java.util.Stack;
import java.util.Iterator;

public class stack {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");

        stack.pop();

        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
