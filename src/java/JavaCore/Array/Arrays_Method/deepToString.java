/*
    Phương thức Arrays_Java.deepToString () được sử dụng để nhận được biểu diễn chuỗi của các mảng đa chiều.
    Phương thức này trả về nội dung sâu của mảng được chỉ định.
    Nếu mảng được chỉ định chứa các mảng khác như là các phần tử thì nó sẽ trả lại nội dung của các mảng đó.

* */

package src.java.JavaCore.Array.Arrays_Method;

import java.util.Arrays;

public class deepToString {
    public static void main(String[] args) {
        // One Dimensional Array

        String[] oneDArray = new String[] {
                "ONE", "TWO", "THREE", "FOUR", "FIVE"
        };
        System.out.println("One Dimensional Array : ");
        // Printing one dimensional array contents using deepToString() method
        System.out.println(Arrays.deepToString(oneDArray));

        // Two Dimensional Array

        String[][] twoDArray = new String[][] {
                { "ONE", "TWO", "THREE", "FOUR" },
                { "FIVE", "SIX", "SEVEN" },
                { "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" }
        };
        System.out.println("Two Dimensional Array : ");
        // Printing two dimensional array contents using deepToString() method
        System.out.println(Arrays.deepToString(twoDArray));

        // Three Dimensional Array
        String[][][] threeDArray = new String[][][] {
                {
                        { "ONE", "TWO", "THREE" },
                        { "FOUR", "FIVE", "SIX", "SEVEN" }
                }, {
                { "EIGHT", "NINE", "TEN", "ELEVEN" },
                { "TWELVE", "THIRTEEN", "FOURTEEN" }
        }, {
                { "FIFTEEN", "SIXTEEN" },
                { "SEVENTEEN", "EIGHTEEN", "NINETEEN" },
                { "TWENTY", "TWENTY ONE" }
        }
        };
        System.out.println("Three Dimensional Array : ");
        // Printing three dimensional array contents using deepToString() method
        System.out.println(Arrays.deepToString(threeDArray));
    }
}