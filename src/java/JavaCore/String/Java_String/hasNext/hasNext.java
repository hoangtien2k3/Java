/*
*
*   Phương thức Scanner.hasNext() trong java: này sẽ trả về giá trị true nếu trong chuỗi vẫn chưa rỗng,
*   ngược lại trả về false nếu chuỗi rỗng, tức là kết thúc chuỗi.
*
*
* */

package src.java.JavaCore.String.Java_String_Methods.Scanner_hasNext;

import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(sc.hasNext())
            System.out.println(++i + " " + sc.nextLine());
    }

}
