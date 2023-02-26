/*
*   syntax:
*           Public boolean isEmpty()
*
*   => Phương thức isEmpty() của lớp Java Vector được sử dụng để kiểm tra xem vector này không có
*      thành phần nào. Nó trả về true nếu vectơ trống
 *
* */

package src.java.Collection.List.Vector.Vector_Methods;
import java.util.Vector;
public class isEmpty {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector < String > vec = new Vector < String > ();
        //Add elements in the vector
        vec.add("Java");
        vec.add("Ruby");
        vec.add("Android");
        vec.add("Python");
        //Displaying the Vector
        System.out.println("Vector:  " + vec);
        //Verifying if the Vector is empty or not
        System.out.println("Is the Vector empty? = " +vec.isEmpty());
        //Clear the Vector
        vec.clear();
        //Displaying the Vector Again
        System.out.println("Vector after clear(): " +vec);
        //Verifying if the Vector is empty or not
        System.out.println("Is the Vector empty? = " +vec.isEmpty());
    }
}
