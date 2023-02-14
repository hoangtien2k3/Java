/*
    Java Reflection:
*       => Reflection trong Java là một API - Application Programming Interface (Giao diện lập trình ứng dụng),
           được sử dụng trong thời gian chạy để phân tích hoặc thay đổi lớp, phương thức và giao diện.
           Nó là quá trình kiểm tra hoặc sửa đổi các hành vi trong thời gian chạy của một lớp tại thời
           gian chạy.


   * Kiến Trúc Của Java Reflection API:
        + Class<T>: lớp này đại diện cho các lớp, interface và chứa các phương thức dùng để lấy các đối tượng kiểu Constructor, Field, Method,…

        + AccessibleObject: các kiểm tra về phạm vi truy xuất (public, private, protected) của field, method, constructor sẽ được bỏ qua.
          Nhờ đó bạn có thể dùng reflection để thay đổi, thực thi các thành phần này mà không cần quan tâm đến phạm vi truy xuất của nó.

        + Constructor: chứa các thông tin về một constructor của lớp.

        + Field: chứa các thông tin về một field của lớp, interface.

        + Method: chứa các thông tin về một phương thức của lớp, interface.
*
*

    * Classes ( Lớp ):
        + Class Name
        + Class Modifies (public, private, synchronized etc.)
        + Package Info
        + Superclass
        + Implemented Interfaces
        + Constructors
        + Methods
        + Fields
        + Annotations
*


    * Tạo Đối Tượng Class:
        => Đối tượng kiểu Class được tạo ra bằng cách sử dụng phương thức static Class.forName().


        try {
            Class c =  Class.forName("com.gpcoder.Cat");
            // ...
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }




    * Cấu trúc Constructor:
        => Các đối tượng lớp Contructor là những phuơng thức khởi tạo của một lớp.
           Reflection cho phép lấy ra những Contructor từ Class Object:


            + Class aClazz = Cat.class; // obtain class object
            + Constructor[] constructors = aClazz.getConstructors();


            * Lấy một Constructor cụ thể :
                + Class aClazz = Cat.class; // obtain Class object
                + Constructor constructor = aClazz.getConstructor(new Class[]{String.class});



    * Field ( Trường ):
            Class aClazz = Cat.class;
            Field field = aClazz.getField("name"); // Tên field cần lấy

            // Lấy danh sách tất cả các field được khai báo là public
            Field[] fields = aClazz.getFields();


* */



package src.java.JavaCore.OOP.JavaObjectClass.Object_and_Class.Reflection_API;

public class Learn_Java_Reflection {
}
