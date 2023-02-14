/*

*   => Object cloning là cách để tạo ra một bản sao chính xác của một đối tượng bị clone.
*      Phương thức clone() được sử dụng để tạo ra một object mới.
*      Class của đối tượng mà chúng ta muốn clone phải được implements từ interface java.
*
    => Object Cloning hay Object Copy

    => Nếu chúng ta thực hiện nó bằng cách sử dụng từ khoá new sẽ mất rất nhiều tiến trình
       xử lý được thực hiện, đó là lý do tại sao chúng ta sử dụng object cloning.

    => Khi ta thay đổi giá trị của 1 object, thì object thứ 2 sẽ không bị thay đổi.



*   Chú ý:
*       Class của đối tượng mà chúng ta muốn clone phải được implements từ interface java.lang.Cloneable.
*       Nếu chúng ta không implements interface Cloneable, phương thức clone() sinh ra lỗi ngoại lệ
*       CloneNotSupportedException.
*
*
*   Syntax:
*           protected native Object clone() throws CloneNotSupportedException;



    * Có 2 loại Cloning:
        + shallow copy / shallow cloning
        + deep copy / deep cloning



    * Ưu điểm và Nhược điểm khi sử dụng Object Cloning:

        + Ưu điểm:
            + không phải gán từng thuộc tính bằng tay.

            + tránh lặp code.

            + dễ dàng cài đặt và hiệu xuất tốt hơn so với sử dụng reflection hay copy array.


        + Nhược điểm:
            + để sử dụng phương thức clone() chúng ta phải thay đổi code bên trong class.

            + chúng ta phải implement interface Cloneable trong khi nó có thể không có bất kỳ cài đặt nào trước đó.

            + Object.clone() là projected vì vậy chúng ta phải cung cấp phương thức clone() riêng vaf gián tiếp gọi
              Object.clone() từ nó.

            + Nếu bạn muốn viết một phương thức clone() cho một lớp con thì tất cả các superclasses của nó sẽ phải
              định nghĩa lại phương thức clone() hoặc kế thừa từ một lớp cha khác. Nếu không phương thức clone()
              sẽ lỗi hoặc đối tượng của lớp con sẽ bị tham chiếu (shallow copy).


* */

package src.java.JavaCore.OOP.JavaOOPsMisc.Object_Cloning;

import java.lang.Cloneable;

public class Object_Cloning implements Cloneable {
    int age;
    String name;

    Object_Cloning(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Age: " + age + " - " + "Name: " + name);
    }

    public static void main(String args[]) {
        try {

            Object_Cloning s1 = new Object_Cloning(19, "Tiến");
            Object_Cloning s2 = (Object_Cloning) s1.clone(); // Object Cloning/Copy

            System.out.println(s1);
            System.out.println(s2);

            s1.display();
            s2.display();

            s2.name = "Chung";
            s2.display();

            s1.display();


            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());


        } catch (CloneNotSupportedException c) {
            System.out.println("Continue");
        }
    }
}

