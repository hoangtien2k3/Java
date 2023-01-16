/*
   Ex:
        000.12.12.034
        121.234.12.12
        23.45.12.56
        00.12.123.123123.123
        122.23
        Hello.IP

* */
package Hackerrank_Solution.Java_Solutions;

import java.util.regex.Pattern;
import java.util.Scanner;

class Regex{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex {
    // String num = "[01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5]";
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}