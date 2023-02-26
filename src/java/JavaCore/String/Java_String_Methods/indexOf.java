package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*           int indexOf(int ch) //Trả về vị trị của giá trị Char đã cho.
            int indexOf(int ch, int fromIndex) //Trả về vị trị của giá trị Char đã cho tính từ vị trí fromIndex.
            int indexOf(src.java.JavaCore.Java_String.String substring) //Trả về vị trị của chuỗi con.
            int indexOf(src.java.JavaCore.Java_String.String substring, int fromIndex) //Trả về vị trị của chuỗi con đã cho tính từ vị trí fromIndex.
*
* */

public class indexOf {
    public static void main(String args[]) {
        String s1 = "this is index of example";

        //Truyền vào chuỗi con
        int index1 = s1.indexOf("is");
        int index2 = s1.indexOf("index");
        System.out.println(index1 + "  " + index2);//2 8

        //Truyền vào chuỗi con và chỉ số bắt đầu
        int index3 = s1.indexOf("is", 4);
        System.out.println(index3);//5

        //Truyền vào giá trị Char
        int index4 = s1.indexOf('s');
        System.out.println(index4);//3
    }
}
