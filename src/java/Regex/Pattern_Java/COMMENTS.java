/*
*   Pattern.COMMENTS :  cho phép khoảng trắng và comment trong mẫu.
*
*      - Khoảng trắng bị bỏ qua và các nhận xét được nhúng bắt đầu bằng # sẽ bị bỏ qua cho đến cuối cùng.
*      - Chế độ nhận xét sẽ được bật thông qua biểu thức cờ nhúng (?x)
*
* */
package src.java.Regex.Pattern_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class COMMENTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Date of birth: ");
        String dob = sc.nextLine();
        //Regular expression to accept date in MM-DD-YYY format
        String regex = "^(1[0-2]|0[1-9])/# For Month "
                + "(3[01]|[12][0-9]|0[1-9])/# For Date "
                + "[0-9]{4}$ # For Year";
        //Creating a Pattern object
        Pattern pattern = Pattern.compile(regex, Pattern.COMMENTS);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(dob);
        boolean result = matcher.matches();
        if(result) {
            System.out.println("Given date of birth is valid");
        } else {
            System.out.println("Given date of birth is not valid");
        }
    }
}
