/*
 *   Pattern. LITERAL Cho phép phân tích cú pháp theo nghĩa đen của mẫu.
 *
 *   Khi cờ này được chỉ định thì chuỗi đầu vào chỉ định mẫu được coi như một chuỗi các ký tự chữ.
 *
 * */

package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LITERAL {
    public static void main(String[] args) {
        String input = "This is the first line " + "This is the second line " + "^This is the third line";
        //Regular expression to accept date in MM-DD-YYY format
        String regex = "^This";
        //Creating a Pattern object
        Pattern pattern = Pattern.compile(regex, Pattern.LITERAL);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }
        System.out.println("Number of matches: " + count);
    }
}
