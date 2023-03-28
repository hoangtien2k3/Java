package src.java.Regex.Pattern_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MULTILINE {
    public static void main( String args[] ) {
        //String regex = "(^This)";//.*t$)";
        String input = "2234 This is a sample text " + "1424 This second 2335 line " + "This id third 455 line " + "Welcome to Tutorialspoint ";
        Pattern pattern = Pattern.compile("^([0-9]+).*");//, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
