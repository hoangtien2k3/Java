package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UNIX_LINES {
    public static void main(String[] args) {
        String input = "This is the first line\r" + "This is the second line\r" + "This is the third line\r";
        //Regular expression to accept date in MM-DD-YYY format
        String regex = "^T.*e";
        //Creating a Pattern object
        Pattern pattern = Pattern.compile(regex, Pattern.UNIX_LINES);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }
        System.out.println("Number of matches: "+count);
    }
}
