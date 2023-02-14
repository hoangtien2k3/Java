/*
    Java Reflection:
*       => Reflection trong Java là một API - Application Programming Interface (Giao diện lập trình ứng dụng),
           được sử dụng trong thời gian chạy để phân tích hoặc thay đổi lớp, phương thức và giao diện.
           Nó là quá trình kiểm tra hoặc sửa đổi các hành vi trong thời gian chạy của một lớp tại thời
           gian chạy.
 *
        + java.lang
        + java.lang.reflect



   * Phương Thức:
        + public String getName() : trả về tên của lớp

        + public static Class forName(String className) : Phương thức này tải lớp và trả lại tham chiếu của lớp

        + public Object newInstance() : Nó tạo nên một đối tượng mới của lớp

        + public boolean isInterface() : Phương thức này kiểm tra xem liệu nó có phải là một giao diện hay không

        + public boolean isArray(): Phương thức này kiểm tra xem liệu nó có phải một mảng hay không

        + public boolean isPrimitive() : Phương thức này kiểm tra xem liệu nó có phải nguyên thủy hay không

        + public Class getSuperclass() : Nó trả về siêu lớp hoặc tham chiếu lớp cha

        + public Field[] getDeclaredFields() : Nó trả về tổng số fields trong lớp

        + public Method[] getDeclaredMethods() : Nó trả lại tổng số phương thức của lớp

        + public Method getDeclaredMethod(String name,Class[] parameterTypes) : Phương thức này trả lại phương thức lớp instance

        + public Constructor[] getDeclaredConstructors() : Nó trả lại tổng số hàm tạo của  lớp




   * Cách lấy đối tượng của lớp Reflection trong Java:
        + Phương thức của lớp Class forName()
        + Phương thức của lớp Object getClass()
        + Cú pháp .class
*
* */

package src.java.JavaCore.OOP.JavaObjectClass.Object_and_Class.Reflection_API;

public class Java_Reflection {
}
