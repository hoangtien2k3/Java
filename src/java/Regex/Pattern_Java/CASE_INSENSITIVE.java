/*
*   Pattern. CASE_INSENSITIVE Cho phép đối sánh không phân biệt chữ hoa chữ thường.

        Theo mặc định, đối sánh không phân biệt chữ hoa chữ thường giả định rằng chỉ các
        ký tự trong bộ mã US-ASCII mới được so khớp.

* */

package src.java.Regex.Pattern_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CASE_INSENSITIVE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string value: ");
        String str = sc.next();
        Pattern pattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches()){
            System.out.println("Given string is a boolean type");
        } else {
            System.out.println("Given string is not a boolean type");
        }
    }
}
