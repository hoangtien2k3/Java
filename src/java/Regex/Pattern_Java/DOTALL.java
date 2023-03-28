package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DOTALL {
    public static void main( String args[] ) {
        String regex = ".";
        String input = "this is a sample this is second line";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.print(matcher.group());
        }
        System.out.println();
        System.out.println("Number of new line characters: "+count);
    }
}
