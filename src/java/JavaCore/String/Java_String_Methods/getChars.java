package src.java.JavaCore.String.Java_String_Methods;

/*
 *   syntax:
 *           public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
 *
 *          => sao chép nội dung của chuỗi thành mảng Char cụ thể.
 *          => Có 4 đối số truyền vào phương thức getChars().
 * */

public class getChars {
    public static void main(String args[]) {
        String str = new String("hello Java how are you?");
        char[] ch = new char[4];
        try {
            str.getChars(6, 10, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
