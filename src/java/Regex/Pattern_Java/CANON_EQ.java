package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *   Pattern.CANON_EQ : Khi cờ này được chỉ định, hai ký tự sẽ được coi là khớp nếu và chỉ nếu,
 *                      các phân tích hợp quy đầy đủ của chúng khớp nhau.
 * */
public class CANON_EQ {
    public static void main( String args[] ) {
        String regex = "a\u030A";
        Pattern pattern = Pattern.compile(regex, Pattern.CANON_EQ);
        String[] input = {"\u00E5", "a\u0311", "a\u0325", "a\u030A", "a\u1E03", "a\uFB03" };
        for (String ele : input) {
            Matcher matcher = pattern.matcher(ele);
            if(matcher.matches()) {
                System.out.println(ele+" is a match for "+regex);
            } else {
                System.out.println(ele+" is not a match for "+regex);
            }
        }
    }
}
