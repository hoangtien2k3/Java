/*
    Định nghĩa:
        + Static nested class trong Java là một lớp nằm trong một lớp khác và được khai báo với từ khóa static.

        + Nó có thể truy cập các biến và phương thức static của lớp cha nhưng không thể
          truy cập các biến và phương thức instance của lớp cha.

    Lưu ý:
        + Static nested class có thể được truy cập mà không cần tạo ra một đối tượng của lớp cha.
          Nó có thể được truy cập bằng tên lớp cha và tên lớp con, ví dụ, OuterClass.StaticNestedClass.

        + Static nested class thường được sử dụng khi một lớp cần truy cập các biến hoặc phương thức static của lớp cha,
        nhưng không cần truy cập các biến hoặc phương thức instance của lớp cha.
*/


package src.java.InnerClass;

public class Static_nested_class {
    static int outerStaticVar = 10;
    int outerInstanceVar = 20;

    static class StaticNestedClass {
        void accessOuterStaticVar() {
            System.out.println("Accessing outer static variable: " + outerStaticVar);
        }

        static void accessOuterStaticVar_1() {
            System.out.println("Accessing outer static variable: " + outerStaticVar);
        }

        void accessOuterInstanceVar() {
            // Cannot access outer instance variable in a static context
            // System.out.println("Accessing outer instance variable: " + outerInstanceVar);
        }
    }

    public static void main(String[] args) {
        Static_nested_class.StaticNestedClass obj = new Static_nested_class.StaticNestedClass();
        obj.accessOuterStaticVar();

        Static_nested_class.StaticNestedClass.accessOuterStaticVar_1();


    }
}
