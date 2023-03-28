/*
*   Pattern matcher() method in Java:
*
*   Lớp mẫu của gói này là một biểu diễn được biên dịch của một biểu thức chính quy.
*   Phương thức matcher() của lớp này chấp nhận một đối tượng
*
* */
package src.java.Regex.Pattern_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matcher {
    public static void main(String args[]) {
        //Reading string value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string");
        String input = sc.nextLine();
        //Regular expression to find vowels
        String regex = "[aeiou]";
        //Compiling the regular expression
        Pattern pattern = Pattern.compile(regex);
        //Retrieving the matcher object
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            System.out.println("Given string contains vowels");
        } else {
            System.out.println("Given string does not contain vowels");
        }
    }
}
