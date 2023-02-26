/*
    định nghĩa:
        +  Nested interface trong Java là một interface được khai báo bên trong một lớp hoặc một interface khác.

        + Nó có thể được truy cập bằng tên của lớp hoặc interface cha và tên của interface con

    Lưu ý:

        + Nested interface thường được sử dụng khi một lớp hoặc interface cần định nghĩa một số interface
          con để mô tả mối quan hệ giữa các lớp hoặc interface.

        + Nested interface cũng có thể được sử dụng để giữ gìn tính riêng tư của các interface.
*/

package src.java.InnerClass;

class OuterClass {
    interface NestedInterface {
        void display();
    }
}

interface Showable {
    void show();
    interface Message {
        void msg();
    }
}

public class Nested_Interface implements OuterClass.NestedInterface {
    public void display() {
        System.out.println("Nested interface");
    }

    public static void main(String[] args) {
        OuterClass.NestedInterface obj = new Nested_Interface(); // upcasting
        obj.display();
    }
}

