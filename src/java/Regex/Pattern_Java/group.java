/*
*   Matcher group() method in Java:
*
    Phương thức group() của lớp (Matcher) này trả về chuỗi con đầu vào đã khớp trong lần khớp cuối cùng.
*
* */
package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class group {
    public static void main(String args[]) {
        String line = "This order was placed for QT3000! OK?";

        // Create a Pattern object
        Pattern r = Pattern.compile("(.*?)(\\d+)(.*)");

        // Now create matcher object.
        Matcher m = r.matcher(line);

        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
