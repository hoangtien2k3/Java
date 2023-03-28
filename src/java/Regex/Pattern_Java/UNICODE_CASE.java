/*
*   Pattern. UNICODE_CASE Cho phép gấp chữ viết hoa nhận biết Unicode.
*
*   Khi cờ này được chỉ định thì đối sánh không phân biệt chữ hoa chữ thường,
*   khi được cờ CASE_INSENSITIVE bật thì sẽ được thực hiện theo cách nhất quán với chuẩn Unicode.
*
* */

package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UNICODE_CASE {
    public static void main( String args[] ) {
        String regex = "\u00de";
        //Compiling the regular expression
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        //Retrieving the matcher object
        String str[] = {"\u00de", "\u00fe", "\u00ee", "\u00ce"};
        for (String ele : str) {
            Matcher matcher = pattern.matcher(ele);
            if(matcher.matches()) {
                System.out.println(ele+" is a match for "+regex);
            } else {
                System.out.println(ele+" is not a match for "+regex);
            }
        }
    }
}
