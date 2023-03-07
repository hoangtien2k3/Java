/*
    * Thêm phần tử từ LinkedList này sang LinkedList khác
*
        syntax:
*               list.addAll(E e)
*
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class addAll {
    public static void main(String[] args){

        LinkedList<String> mammals = new LinkedList<>();
        mammals.add("Dog");
        mammals.add("Cat");
        mammals.add("Horse");
        System.out.println("Mammals: " + mammals);

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Crocodile"); // thêm phần tủ vào LinkedList animals

        // Add all elements of mammals in animals
        animals.addAll(mammals); // addAll tất cả phần tủ từ mammals sang animals
        System.out.println("Animals: " + animals);

    }
}
