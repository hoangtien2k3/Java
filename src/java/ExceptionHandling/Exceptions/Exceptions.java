/*
*   Exception là gì?
        Theo từ điển: Exception (ngoại lệ) là một tình trạng bất thường.

*   Exception Handling là gì?
        Exception Handling (xử lý ngoại lệ) là một cơ chế xử lý các lỗi runtime như
        ClassNotFound, IO, SQL, Remote, vv
*
*
*   Các kiểu của ngoại lệ:
        Có hai loại ngoại lệ chính là:
            + checked
            +unchecked.

        Còn Sun Microsystem nói rằng có ba loại ngoại lệ:
            + Checked Exception
            + Unchecked Exception
            + Error

*   Các kịch bản phổ biến nơi ngoại lệ có thể xảy ra:

*       1. Kịch bản ArithmeticException xảy ra
            Nếu chúng ta chia bất kỳ số nào cho số 0, xảy ra ngoại lệ ArithmeticException.

            Ex:
                int a=50/0; //ArithmeticException


        2. Kịch bản NullPointerException xảy ra
            Nếu chúng ta có bất kỳ biến nào có giá trị null , thực hiện bất kỳ hoạt động
            nào bởi biến đó sẽ xảy ra ngoại lệ NullPointerException.

            Ex:
                String s=null;
                System.out.println(s.length()); //NullPointerException


*       3. Kịch bản NumberFormatException xảy ra
            Sự định dạng sai của bất kỳ giá trị nào, có thể xảy ra NumberFormatException.
            Giả sử ta có một biến String có giá trị là các ký tự, chuyển đổi biến này thành số sẽ xảy ra NumberFormatException

            Ex:
                String s="abc";
                int i=Integer.parseInt(s);//NumberFormatException


        4. Kịch bản ArrayIndexOutOfBoundsException xảy ra
            Nếu bạn chèn bất kỳ giá trị nào vào index sai, sẽ xảy ra ngoại lệ ArrayIndexOutOfBoundsException
            như thể hiện dưới đây:

            Ex:
                int a[]=new int[5];
                a[10]=50; //ArrayIndexOutOfBoundsException

* */

package src.java.ExceptionHandling.Exceptions;

public class Exceptions {
}
