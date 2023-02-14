/*
*   - Không giống C++, Java hỗ trợ một block đặc biệt gọi là static block được sử dụng để
*     khởi tạo giá trị cho các thuộc tính static của class.
*
*   - Các mã code bên trong static block được thực thi một lần tại thời điểm đầu tiên class
*     được tải và bộ nhớ.
*
*   => Khối static (static blocks): được sử dụng để khởi tạo thành viên dữ liệu static.
*
* */

/*
*   + Khối khởi tạo tĩnh trong Java là khối chạy trước phương thức main () trong Java.
*
*   + Java không quan tâm xem khối này được viết sau phương thức main () hay trước phương thức main (),
*
*   + Trong toàn bộ chương trình, Khối khởi tạo tĩnh sẽ chỉ thực thi một lần
*
*   + Có thể có nhiều Khối khởi tạo tĩnh trong một class
*
*   + Nếu chúng ta có nhiều Static Initialization Block trong Java thì chúng được gọi theo thứ tự được viết trong chương trình.
*
*   + Khối này sẽ không trả về bất cứ thứ gì.
*
*   + Không thể ném các ngoại lệ đã kiểm tra.
*
*   + Chúng tôi không thể sử dụng từ khóa "this" vì nó không có bất kỳ instance nào.
*
* */


package src.java.JavaCore.OOP.JavaObjectClass.Static.Static_Block;

class Test {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("1. static block first called ");
        // static block sẽ được gọi đầu tiên và được goị đúng 1 lần duy nhất
        // static block dùng để khởi tạo giá trị cho các thuộc tính static trong class
    }
    Test() {
        System.out.println("2. Constructor called");
    }
}

public class Static_Block {
    public static void main(String[] args) {

        Test t1 = new Test();
        new Test();

    }
}
