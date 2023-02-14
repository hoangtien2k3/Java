package src.main.com.java.JavaCore;

/*
 *   1. src.main.com.java.JavaCore.Java_String.String.valueOf()
 *        int i=10;
 *        src.main.com.java.JavaCore.Java_String.String s=src.main.com.java.JavaCore.Java_String.String.valueOf(i);//Now it will return "10"
 *
 *   2. Integer.toString()
 *          int i=10;
 *          src.main.com.java.JavaCore.Java_String.String s=Integer.toString(i);//Now it will return "10"
 *
 *   3. src.main.com.java.JavaCore.Java_String.String.format()
 *          int i=200;
 *          src.main.com.java.JavaCore.Java_String.String s=src.main.com.java.JavaCore.Java_String.String.format("%d",i);
 *
 * */


public class Convert_in_to_String {
    public static void main(String[] args) {

        int x = 10;

        String str1 = String.valueOf(x); // convert from int into String used "valueOf"
        String str2 = Integer.toString(x); // convert from int into String used "toString"
        String str3 = String.format("%d", x); // convert from int into String used "format"

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

}
