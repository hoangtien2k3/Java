/*
*
*
*
*
*   Lưu ý:
*       + Cần lưu ý rằng, Member Inner Class có thể truy cập các thuộc tính và phương thức của lớp chính
*       nhưng không có quyền truy cập các biến static của lớp chính.
*
*
* */


package JavaCore.Java_Inner_Class;

public class Member_inner_class {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {

        Member_inner_class obj = new Member_inner_class();
        Member_inner_class.Inner in = obj.new Inner();

        in.msg();
    }
}
