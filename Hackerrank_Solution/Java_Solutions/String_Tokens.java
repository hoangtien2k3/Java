package Hackerrank_Solution.Java_Solutions;

import java.util.Scanner;

public class String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Sử dụng Regex trong Java.
        s = s.replaceAll("[^a-zA-Z]"," ");
        s = s.replaceAll("\\s+"," "); // \\s : bất kỳ ký tự khoảng trắng, xuống dòng, ...
        s = s.trim(); // xóa khoảng trắng ở đầu và cuối chuỗi

        String[] arr = s.split(" ");
        if(s.length() > 0){
            System.out.println(arr.length);
            for (String i : arr) {
                System.out.println(i);
            }
        } else
            System.out.println(0);

        scan.close();
    }
}
