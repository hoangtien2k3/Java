package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*       public src.java.JavaCore.Java_String.String replace(char oldChar, char newChar)
        public src.java.JavaCore.Java_String.String replace(CharSequence target, CharSequence replacement)
*
*       => sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
*
* */

public class replace {
    public static void main(String args[]) {
        String s1 = "ttt hoang tien";
        String replaceString = s1.replace('t', 'j');//thay thế tất cả ký tự 't' thành 'j'
        System.out.println(replaceString);
    }
}
