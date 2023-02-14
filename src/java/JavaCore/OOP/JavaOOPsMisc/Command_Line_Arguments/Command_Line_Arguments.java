/*
*   => Đối số dòng lệnh (Command Line Argument) là thông tin truyền cho các chương trình
*      khi bạn chạy chương trình lập trình.
*
*   => Các thông tin truyền qua lưu trữ như một String Array_1 trong phương thức main.
*      Sau đó, bạn có thể sử dụng Đối số dòng lệnh trong chương trình của bạn.
 *
 *
 *
 *  *** Khi sử dụng Đối số dòng lệnh chúng ta nên chú ý những điểm quan trọng sau:

        + Đối số dòng lệnh có thể được sử dụng để chỉ định thông tin cấu hình trong khi khởi chạy ứng dụng của bạn.

        + Không có giới hạn về số lượng đối số dòng lệnh Java. Bạn có thể chỉ định bất kỳ số lượng đối số nào.

        + Thông tin được truyền dưới dạng Chuỗi (String).

        + Chúng được ghi vào String args của phương thức main
*
* */

package src.java.JavaCore.OOP.JavaOOPsMisc.Command_Line_Arguments;

public class Command_Line_Arguments {
    public static void main(String b[]){
        System.out.println("Argument one = " + b[0]);
        System.out.println("Argument two = " + b[1]);
    }
}
