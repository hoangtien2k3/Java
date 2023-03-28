/*
*   Pattern compile() method in Java:
*       Phương thức compile() của lớp này chấp nhận một giá trị chuỗi đại diện cho
*       một biểu thức chính quy và trả về một đối tượng Mẫu.
*
* */
package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class compile {
    public static void main( String args[] ) {
        //Compiling the regular expression
        Pattern pattern = Pattern.compile("t", Pattern.CASE_INSENSITIVE);
        //Retrieving the matcher object
        Matcher matcher = pattern.matcher("Tutorialspoint");
        int count = 0;
        while(matcher.find()) {
            count++;
        }
        System.out.println("Number of matches: "+count);
    }
}
