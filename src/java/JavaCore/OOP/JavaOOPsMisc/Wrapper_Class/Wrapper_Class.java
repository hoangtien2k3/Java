/*
    ** KHÁI NIỆM CƠ BẢN:
            + Wrapper Class.
            + Autoboxing.
            + Unboxing.


*   => Lớp Wrapper trong Java là loại lớp cung cấp một cơ chế để chuyển đổi loại dữ liệu
*      nguyên thủy thành đối tượng và ngược lại.
*
*
*   => Autoboxing là quá trình mà trình biên dịch của Java tự động chuyển đổi giữa kiểu dữ liệu
*     cơ bản (Primitive type) về đối tượng tương ứng với lớp (Wrapper class) của kiểu dữ liệu đó.
*
*
*   => Unboxing là quá trình mà trong đó trình biên dịch Java sẽ tự động chuyển đổi các đối tượng
*      lớp Wrapper thành các kiểu căn bản tương ứng của chúng.
 *
 *
 *
 *
 * ///////////////////////////////////////////////////////////////////////////////////////////////////////
 *
 *  * TẠI SAO LẠI CẦN DÙNG Wrapper Class:
 *          + rapper sẽ giúp chúng ta chuyển đổi qua lại giữa một kiểu dữ liệu nguyên thủy sang
 *            kiểu dữ liệu đối tượng và ngược lại.
 *
 *              Ex: int a = 20; // a là biến có kiểu dữ liệu int nguyên thủy
                    Integer i = Integer.valueOf(a); // i là biến có kiểu dữ liệu đối tượng Integer, được tạo ra từ biến nguyên thủy a

*
*           + Kiểu dữ liệu nguyên thủy, nếu bạn không gán giá trị thì nó vẫn được tạo với giá trị mặc đinh là 0.
*             Còn wrapper class (kiểu dữ liệu đối tượng) thì giá trị mặc định của nó sẽ là null. (null là nó chưa có giá trị)
*
*
*
*
*   ///////////////////////////////////////////////////////////////////////////////////////////////////////
*
*   * Các Phương Thức Hữu Ích Khi Sử Dụng Wrapper :
*       =>  Wrapper giúp tạo thêm cho các kiểu dữ liệu nguyên thủy vốn chỉ có tác dụng chứa đựng dữ liệu,
*           trở thành một đối tượng với nhiều phương thức hữu dụng hơn.
*
*
*           + parseXxx() : chuyển
*                   Ex: int i = Integer.parseInt("10");
                        float f = Float.parseFloat("4.5");
                        boolean b = Boolean.parseBoolean("true");


            + toString()
                    Ex: String sI = Integer.toString(10);




            + xxxValue() : chuyển từ wrapper sang primitive(nguyên thủy).
                    Ex: Double d = 50.5;
                        int i = d.intValue();
                        byte b = d.byteValue();


            + comparaTo() :
                    => nếu trong bài chuỗi, thì compareTo() dùng để so sánh 2 chuỗi với nhau
                    => với Wrapper thì nó dùng để so sánh 2 wrapper với nhau.

                Ex: lopWrapper1.compareTo(lopWrapper2)
                – Nếu kết quả của phương thức trả về một số âm, thì lopWrapper1 sẽ có giá trị nhỏ hơn lopWrapper2.
                – Nếu kết quả của phương thức trả về số 0, thì lopWrapper1 sẽ có giá trị bằng với lopWrapper2.
                – Nếu kết quả của phương thức trả về một số dương, thì lopWrapper1 sẽ có giá trị lớn hơn lopWrapper2.

*
*
*           + compare() : nó có chức năng giống với compareTo() trên. Khác ở chỗ đây là phương thức static
*                         của lớp Wrapper nên nó có thể gọi trực tiếp từ lớp.
*
*               Ex:
*                   Integer i1 = Integer.parseInt("50");
                    Integer i2 = Integer.valueOf(52);

                    System.out.println("Compare i1 & i2: " + Integer.compare(i1, i2));

                    Float f1 = new Float("20.25f");
                    Float f2 = new Float("2.43f");

                    System.out.println("Compare f1 & f2: " + Float.compare(f1,f2));
*
*
* */

package src.java.JavaCore.OOP.JavaOOPsMisc.Wrapper_Class;

public class Wrapper_Class {
    public static void main(String[] args) {

        // wrapper class and autoboxing in java

        int x = 10; // kiểu nguyên thủy ( Primitive type )

        // chuyển đổi từ Primitive (nguyên thủy) sang Wrapper class:
        Integer y = new Integer(10); // wrapper class, kiểu tham chiếu.
        Integer zzz = new Integer(x);   // wrapper class int


        // chuyển đổi từ Wrapper class sang Primitive (nguyên thủy):
        int a = 500;
        Integer i = a; // Autoboxing wrapper class
        int i2 = i.intValue(); // Unboxing


        Integer myInt = 10;         // tự động autoboxing sang int
        Double myDouble = 11.65;    // autoboxing sang  double
        Character myChar = 'T';     // autoboxing sang char
        Boolean myBool= true;       // autoboxing sang bool


        int z = x + y;  // autoboxing, cụ thể là unautoboxing, tức là chuyển đổi từ Integer về int
        System.out.println(z);
        System.out.println(zzz + z + i2);


        int z1 = Integer.valueOf("45"); // cách 1: chuyển đổi từ chuỗi sang int dùng ( valueOf )
        int z2 = Integer.parseInt("45"); // cách 2: chuyển đổi từ chuỗi sang int dùng ( parseInt )


        Integer k = 10; // thì ở đây, boxing, tự động chuyển đổi từ int thành Integer.
        k = new Integer(10); // khai báo thế này cũng tương tự như trên.


        int x1 = 10; int x2 = 10;
        Integer x3 = 10;
        System.out.println(x1 == x2); // trả về true
        System.out.println(x1 == x3); // trả về true



        Integer k1 = new Integer(10); // tham chiếu, và được lưu trong bộ nhớ heap
        Integer k2 = new Integer(10); // tham chiếu, và được lưu trong bộ nhớ heap có điạ chỉ khác nhau.
        int k3 = 10;

        System.out.println(k1 == k2); // trả về false vì k1 và k2 tham chiếu tới 2 ô nhớ khác nhau trong bộ nhớ heap
        System.out.println(k1 == k3); // trả về true, vì java tự động unboxing từ Integer thành int

        System.out.println(k1.equals(k2)); // trả về true. hàm equals sẽ tự động so sánh giá trị bên trong.



    }
}
