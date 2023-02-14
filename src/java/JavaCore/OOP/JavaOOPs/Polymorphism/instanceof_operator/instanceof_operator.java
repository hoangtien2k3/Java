/*
*     # Toán tử instanceof trong java:
*
*       + Toán tử instanceof trong java được sử dụng để kiểm tra một đối tượng có phải là thể hiển
*         của một kiểu dữ liệu cụ thể không (lớp, lớp con, interface).
*
*       + instanceof trong java được gọi là toán tử so sánh kiểu vì nó so sánh thể hiện với kiểu dữ liệu.
*         Nó trả về giá trị boolean là true hoặc false.
*
*
*
*
*     # Downcasting với toán tử instanceof trong java:
*
*       + Tham chiếu trực tiếp:
*               Ex:         Dog d = new Animal();  // Compilation error
*       + Sử dụng ép kiểu:
*               Ex:         Dog d = (Dog) new Animal();
                            // Compile ok, nhưng lỗi ngoại lệ ClassCastException lúc runtime
 *
 *
 *
 *    #  Sử dụng toán tử instanceof để xác định kiểu phần tử của mảng:
 *
 *
* */


package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.instanceof_operator;

class Animal1 {}

public class instanceof_operator extends Animal1 {
    static void method(Animal1 a) {
        if (a instanceof instanceof_operator) {
            instanceof_operator d = (instanceof_operator) a;    // downcasting
            System.out.println("downcasting is ok");
        }
    }

    public static void main(String[] args) {
        Animal1 a = new instanceof_operator();
        instanceof_operator.method(a);
    }
}
