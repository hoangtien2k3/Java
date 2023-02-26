/*
     * Objects and Classes in Java:

     - Một đối tượng có 3 đặc điểm:

        + state:        nó đại diện cho dữ liệu của một đối tượng

        + behavior:     đại diện cho hành vì, chức năng của một đối tượng.

        + identity:     Nhận dạng đối tượng thường được triển khai thông qua một ID duy nhất.
                        Giá trị của ID không hiển thị cho người dùng bên ngoài. Tuy nhiên,
                        nó được JVM sử dụng nội bộ để xác định từng đối tượng một cách duy nhất.



     * Class in Java: Lớp trong Java.

            + Fields:   thành viên dữ liệu.
            + Methods:  phương thức.
            + Constructors:     hàm khởi tạo.
            + Blocks:   khối lệnh.
            + Nested class and interface:   lớp và interface.


*
     * Ways to initialize Object: cách để tạo một đối tượng
            + Sử dụng từ khóa new
            + Sử dụng phương thức newInstance()
            + Sử dụng phương thức clone()
            + Sử dụng phương thức factory, deserialization...

*

    * Anonymous Object: đối tượng ẩn danh.
         => Nếu bạn phải sử dụng một đối tượng chỉ một lần, một đối tượng ẩn danh là một cách tiếp cận tốt.

            *   Calculation c=new Calculation();
                c.fact(5);

            *   new Calculation().fact(5);  // khi sử dụng đối tượng chỉ 1 lần ( dùng Anonymous ).


 */

package src.java.JavaCore.OOP.JavaObjectClass.Object_and_Class;

public class object_and_class {

    // defining fields
    int id; // field or data member or instance variable
    String name;



    void fact(int  n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("5! = " + fact);
    }


    //creating main method inside the Student_1 class
    public static void main(String args[]) {
        //Creating an object or instance
        object_and_class s1 = new object_and_class(); // creating an object of Student_1

        //Printing values of the object
        System.out.println(s1.id); // accessing member through reference variable
        System.out.println(s1.name);

        new object_and_class().fact(5);

    }
}
