package src.java.JavaCore.String.Java_String_Methods;

/*
 *   syntax:
 *           public static src.java.JavaCore.Java_String.String format(src.java.JavaCore.Java_String.String format, Object... args)
 *           public static src.java.JavaCore.Java_String.String format(Locale locale, src.java.JavaCore.Java_String.String format, Object... args)
 *
 *           => Phương thức formart() trả về một chuỗi được format theo miền địa phương.
 *           =>
 * */

public class formart {
    public static void main(String args[]) {
        String name = "sonoo";
        String sf1 = String.format("name is: %2s", name);
        String sf2 = String.format("value is: %f", 32.33434);
        String sf3 = String.format("value is: %10f", 32.33434);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        
    }
}
