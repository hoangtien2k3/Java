/*
*   Phương thức replaceAll() trả về một chuỗi thay thế tất cả các chuỗi ký tự phù hợp với regex.
*
* */
package src.java.Regex.Pattern_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class replaceAll {
    public static void main(String args[]) {
        //Reading String from user
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //Regular expression to match spaces (one or more)
        // String regex = "\s+";

        //Compiling the regular expression
        // Pattern pattern = Pattern.compile(regex);

        //Retrieving the matcher object
        // Matcher matcher = pattern.matcher(input);

        //Replacing all space characters with single space
        // String result = matcher.replaceAll(" ");
        //System.out.print("Text after removing unwanted spaces: "+result);
    }
}
