/*
        1. ArithmeticException xảy ra
            Nếu chúng ta chia bất kỳ số nào cho số 0, xảy ra ngoại lệ ArithmeticException.

            Ex:
                int a=50/0; //ArithmeticException


        2. NullPointerException xảy ra
            Nếu chúng ta có bất kỳ biến nào có giá trị null , thực hiện bất kỳ hoạt động
            nào bởi biến đó sẽ xảy ra ngoại lệ NullPointerException.

            Ex:
                String s=null;
                System.out.println(s.length()); //NullPointerException


        3. NumberFormatException xảy ra
            Sự định dạng sai của bất kỳ giá trị nào, có thể xảy ra NumberFormatException.
            Giả sử ta có một biến String có giá trị là các ký tự, chuyển đổi biến này thành
            số sẽ xảy ra NumberFormatException

            Ex:
                String s="abc";
                int i=Integer.parseInt(s);//NumberFormatException


        4. ArrayIndexOutOfBoundsException xảy ra
            Nếu bạn chèn bất kỳ giá trị nào vào index sai, sẽ xảy ra ngoại lệ
            ArrayIndexOutOfBoundsException như thể hiện dưới đây:

            Ex:
                int a[]=new int[5];
                a[10]=50; //ArrayIndexOutOfBoundsException




*   Cú pháp của khối lệnh try-catch trong java:
        try {
            // code có thể ném ra ngoại lệ
        } catch(Exception_class_Name ref) {
            // code xử lý ngoại lệ
        }

*   Cú pháp của khối lệnh try-finally trong java
        try {
            // code có thể ném ra ngoại lệ
        } finally {
            // code trong khối này luôn được thực thi
        }


*   => bạn có thể sử dụng nhiều khối Catch với 1 khối Try duy nhất
*   => khối Finally thì luôn luôn được thực hiện và chỉ có duy nhất 1 khối Finally.

* */

package src.java.ExceptionHandling.TryCatch;

public class Try_Catch_Finally {
    public static void main(String args[]) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            String str = "abc";
            int number = Integer.parseInt(str);
        }
        finally {
            System.out.println("Finally thì Luôn Luôn được thực hiện !!!");
        }

    }
}
