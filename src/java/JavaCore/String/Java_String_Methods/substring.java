package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*       public src.java.JavaCore.Java_String.String substring(int startIndex)
        public src.java.JavaCore.Java_String.String substring(int startIndex, int endIndex)
*
*       => subString() trả về chuỗi con của một chuỗi.
*       => bắt đầu và chỉ số kết thúc cho phương thức subString(),
*       => với chỉ số bắt đầu tính từ 0 và chỉ số kết thúc tính từ 1.
* */

public class substring {
    public static void main(String[] args) {
        String name = "hoangtien2k3";
        System.out.println(name.substring(0, 2));
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(4));
    }
}
