/*
*   syntax:
*           // cú pháp phương thức set()
            arraylist.set(int index, E element)
*   => thay thế giá trị mới cho phần tử
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;
import java.util.ArrayList;
public class set {
    public static void main(String[] args) {
        // khai báo một mảng ArrayList languages
        ArrayList<String> languages = new ArrayList<>();
        // sử dụng phương thức add() để thêm phần tử vào mảng languages
        languages.add("Python");
        languages.add("English");
        languages.add("JavaScript");
        System.out.println("Các phần tử trong mảng languages: " + languages);

        // thay thế phần tử tại vị trí 1 bằng phần tử "java" rồi gán phần tử bi thay thế vào biến element
        String element = languages.set(1, "Java");
        System.out.println("Mảng sau khi thay thế: " + languages);
        System.out.println("Phần tử bị thay thế: " + element);
    }
}
