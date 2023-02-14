/*
    *   Sử dụng System.out.printf:
    *       + Sử dụng hàm printf() để định dạng chuỗi và hiển thị ra console.
    *
    *
    * syntax:
    *       - public void System.out.printf(String format, Object... args)
            - public void System.out.printf(Locale locale, String format, Object... args)
*
*     trong đó:
*           locale : xác định locale được áp dụng trong phương thức format.
            format : định dạng của chuỗi.
            args : tham số trong chuỗi format, có thể không có hoặc có nhiều tham số.
*
*
*   //////////////////////////////////////////////////////////////////////////////////////////
*
*       Cấu trúc:
*                   "% [argument index] [flag] [width] [.precision] type"
*
*
*               + % : là một ký tự đặc biệt biểu thị rằng một hướng dẫn định dạng sau.
*               + [argument index] : xác định chỉ số của các đối số để được định dạng.
*               + [flag] là một hướng dẫn định dạng đặc biệt.
*               + [width] xác định số lượng tối thiểu các ký tự output cho đối tượng đó.
*               + [.precession] xác định chính xác của các số dấu chấm động trong output.
*                 Đó là cơ bản số chữ số thập phân bạn muốn in trên đầu ra.
*               + type : type và % là các tham số định dạng bắt buộc duy nhất.
*                 type là kiểu đối tượng sẽ được định dạng trong đầu ra. Đối với các số nguyên d,
*                 cho các chuỗi đó là s, cho các số dấu phẩy là f, cho các số nguyên có định dạng hex là x.
*
* */

/*
*   QUY TẮC ĐỊNH DẠNG CHUỖI:
*
*       - Định dạng kiểu số nguyên:
*           + %d : sẽ in số nguyên như tham số đầu vào.
*           + %6d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm khoảng trắng ở bên trái.
*           + %-6d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm khoảng trắng ở bên phải.
*           + %06d : sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm ký tự số 0 ở bên trái.
*           + %.2d : in tối đa 2 chữ số của số nguyên.
*
*
*       - Định dạng kiểu String:
*           + %s : sẽ in chuỗi tham số đầu vào.
*           + %15s : sẽ in chuỗi như tham số đầu vào. Nếu số chữ số nhỏ hơn 15, đầu ra sẽ được thêm khoảng trắng ở bên trái.
*           + %-6s : sẽ in chuỗi như tham số đầu vào. Nếu số chữ số nhỏ hơn 6, đầu ra sẽ được thêm khoảng trắng ở bên phải.
*           + %.8s : in tối đa tối chuỗi 8 ký tự.
*
*
*       - Định dạng kiểu số thực:
*           + %f : sẽ in số thực như tham số đầu vào.
*           + %15f : sẽ in số thực như tham số đầu vào. Nếu số chữ số nhỏ hơn 15, đầu ra sẽ được thêm khoảng trắng ở bên trái.
*           + %.8f : hiển thị tối đa 8 chữ số thập phân của số.
*           + %9.4f : hiển thị tối đa 4 chữ số thập phân của số. Đầu ra sẽ chiếm ít nhất 9 ký tự. Nếu số chữ số không đủ, nó sẽ được đệm khoảng trắng.
*
*
* */



package src.java.JavaCore.String.Java_String_Methods.String_Format_Java;

public class Format_Java {

    public static void main(String[] args) {
        System.out.printf("Integer: %d\n", 15);
        System.out.printf("Floating point number with 3 decimal digits: %.3f \n", 1.21312939123);
        System.out.printf("Floating point number with 8 decimal digits: %.8f \n", 1.21312939123);
        System.out.printf("String: %s, integer: %d, float: %.6f \n", "Hello World", 89, 9.231435);

        System.out.printf("Re-order output %4$1s %1$2s %3$2s %2$2s \n", "a", "b", "c", "d");

        System.out.println();

        // Định dạng kiểu số nguyên:
        System.out.printf("%-12s %-12s %s %n","Column 1","Column 2","Column3");
        System.out.printf("%-12d %-12d %07d %n", 15, 12, 255);

        System.out.println();

        // Định dạng kiểu String:
        System.out.printf("%-12s %-12s %s\n","Column 1","Column 2","Column3");
        System.out.printf("%-12.5s %-12.5s %s\n", "Hello","World", "TIEN");


        System.out.println();

        // Định dạng kiểu số thực:
        System.out.printf("%-12s %-12s\n","Column 1","Column 2");
        System.out.printf("%-12.5f %.20f\n", 12.23429837482,9.10212023134);



        int a = 12345;

        System.out.println();

    }


}
