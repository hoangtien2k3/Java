package src.java.JavaCore.String.Java_String_Methods;

/*
   syntax:
       public src.java.JavaCore.Java_String.String replaceAll(String regex, String replacement)

      => Phương thức replaceAll() trả về một chuỗi thay thế tất cả các chuỗi ký tự phù hợp với regex.
 */

public class replaceAll {
    public static void main(String args[]) {
        String s1 = "viettuts$ is a very%% good# website's zzz haha's vui vui vui";
        String replaceString = s1.replaceAll("[^a-zA-Z]", " ");
        System.out.println(replaceString);

        String s2 = "viettuts is a ver good website";
        String replaceString2 = s2.replaceAll("t", "3");
        System.out.println(replaceString2);
    }
}

