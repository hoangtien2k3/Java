/*
    Định nghĩa:
        + Một lớp được tạo ra bên trong một phương thức được gọi là local inner class trong java.

        + Nếu bạn muốn gọi các phương thức của lớp được khai báo bên trong một phương thức,
          bạn phải tạo ra thể hiện của lớp này bên trong phương thức chứa nó.


    Lưu ý:
        + Local Inner class không thể được gọi từ một phương thức bên ngoài.
        + Local Inner class không thể truy cập biến local non-final từ JDK 1.7 trở vể trước.
        Kể từ JDK 1.8, có thể truy cập vào các biến local non-final trong lớp local inner class.

*/

package src.java.InnerClass;

public class Local_inner_class {
    private int data = 30; // biến instance

    void display() {
        int value = 50; // biến local phải là final từ jdk 1.7 trở về trước
        class Local {
            void msg() {
                System.out.println(value);
            }
            void print() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
        l.print();
    }

    public static void main(String args[]) {
        Local_inner_class obj = new Local_inner_class();
        obj.display();
    }
}
