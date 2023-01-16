package JavaCore.Java_String.Java_String_Methods;

/*
*   syntax:
*       public JavaCore.Java_String.String toLowerCase()
        public JavaCore.Java_String.String toLowerCase(Locale locale)
*
*       =>  toLowerCase() được sử dụng để chuyển chuỗi về dạng chữ thường.
*
* */

public class toLowerCase {
    public static void main(String args[]) {
        String s1 = "HELLO stRIng";
        String s1lower = s1.toLowerCase();
        System.out.println(s1lower);
    }
}
