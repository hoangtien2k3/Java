/*
    Matcher matches() method in Java:

*   matches(String) được dùng để kiểm tra chuỗi đầu vào có phù hợp với biểu thức regex hay không.
*   Đây là cách thông dụng nhất. Bằng các regex tương tự cho email, id, password...

* */


package src.java.Regex.Pattern_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matches {
    public static void main(String args[]) {
        //Reading String from user
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //Regular expression to match words that starts with digits
        String regex = "^[0-9].*$";
        //Compiling the regular expression
        Pattern pattern = Pattern.compile(regex);
        //Retrieving the matcher object
        Matcher matcher = pattern.matcher(input);

        // cach 1:
        if(matcher.find()) {
            System.out.println("First character is a digit");
        } else {
            System.out.println("First character is not a digit");
        }

        // cach 2:
        //verifying whether match occurred
        boolean bool = matcher.matches();

        if(bool) {
            System.out.println("First character is a digit");
        } else{
            System.out.println("First character is not a digit");
        }
    }
}
