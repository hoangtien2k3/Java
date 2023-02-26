package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*       public char[] toCharArray()
*
*       =>  sử dụng để chuyển đổi chuỗi thành các mảng ký tự.
*       => Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi.
*
* */

public class toCharArray {
    public static void main(String args[]) {
        String s1 = "hello";
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + "\t");
        }
    }
}
