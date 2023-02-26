package src.java.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testExpression {
    // check password
    public static boolean isPasswordAccept(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches() ? true : false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        boolean check = isPasswordAccept(pass);

        if (check) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
