package src.java.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
*   Sử dụng Regex định nghĩa ngày tháng năm:
    \d{1,2}[-|/]\d{1,2}[-|/]\d{4}
        \d{1,2}: nghĩa là một số có 1 hoặc 2 chữ số (ngày và tháng).
        [-|/]: nghĩa là ký tự - hoặc /.
        \d{4}: nghãi là một số có 4 chữ số (năm).
* */
public class RegexExample1 {
    public static void main(String[] args) {
        String text1 = "Hello java regex 12-04-2003, hello world 12/04/2003";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//        Pattern pattern = Pattern.compile("[0-9]{1,2}[-|/][0-9]{1,2}[-|/][0-9]{4}");
        Matcher matcher = pattern.matcher(text1);


        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
//        System.out.println(:"Regex: " + Pattern.matches());
        while (matcher.find()) {
            // chỗ này nó sẽ tìm ra substring mà thích hợp với regex đã xét bên trên.
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }


        String text2 = "12/04/2003";
        String text3 = "12/04/aaaa";
        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
//        pattern = Pattern.compile("^[0-9]{1,2}[-|/][0-9]{1,2}[-|/][0-9]{4}$");
        System.out.println("\nChuỗi " + text2 + " có định dạng ngày tháng: " + pattern.matcher(text2).matches());
        System.out.println("Chuỗi " + text3 + " có định dạng ngày tháng: " + pattern.matcher(text3).matches());
    }
}