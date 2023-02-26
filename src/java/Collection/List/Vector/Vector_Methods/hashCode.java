/*
*  syntax:
*           public int hashCode()
 *
*   => Phương thức hashCode() của lớp Java Vector được sử dụng để lấy giá trị mã băm
*      cho vectơ đang được sử dụng.
*
* */


package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class hashCode {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector < String > colors = new Vector < String > ();
        //Add elements in the vector
        colors.add("White");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");

        //Print the elements of this vector
        System.out.println("Color elements in vector: " + colors);

        //Get the hash code value for this vector
        System.out.println("HashCode: " + colors.hashCode());
    }
}
