package src.java.Regex;

// check số điện thoại

import java.util.regex.Pattern;

public class Check_PhoneNumber {
    public static void main(String args[]){

        String[] phoneNumber = {"0912345678", "(081).231.2132", "(0812).4214.00", "099988999999",
        "083.123.456", "(082).800.7853", "123.456.7890"};

        String regex = "^\\(0[98]{1}\\d\\).\\d{3}.\\d{4}|0[98]{1}\\d{8}|0[98]{1}\\d.\\d{3}.\\d{4}$";

        for(int i = 0; i < phoneNumber.length; i++) {
            if (Pattern.compile(regex).matcher(phoneNumber[i]).find()) {
                System.out.println((i + 1) + ": OKE !!!");
            } else {
                System.err.println((i + 1) + ": Not Oke");
            }
        }

    }
}
