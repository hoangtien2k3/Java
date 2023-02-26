package src.java.JavaCore.String.Java_String_Methods;

/*
 *  syntax:
 *       public byte[] getBytes()
 *       public byte[] getBytes(Charset charset)
 *       public byte[] getBytes(src.java.JavaCore.Java_String.String charsetName)throws UnsupportedEncodingException
 *
 *       => Phương thức getBytes() trả về mảng byte của chuỗi.
 * */

public class getBytes {
    public static void main(String args[]) {
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.print(barr[i] + " "); // return về giá trị của ký tự đó trong bảng mã ASCII
        }
    }
}
