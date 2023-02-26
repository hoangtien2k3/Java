/*
*   => Lớp HashMap trong java là một lớp kế thừa lớp AbstractMap và triển khai của Map src.java.JavaCore.Interface
*      trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với Map.
*
*
*
*   Những điểm quan trọng về lớp HashMap trong java là:

        + HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
        + Nó chứa các key duy nhất.
        + Nó có thể có 1 key là null và nhiều giá trị null.
        + Nó duy trì các phần tử KHÔNG theo thứ tự.
*
*
*   syntax:
*
            public class HashMap<Key,Value> extends AbstractMap<Key,Value>
                implements Map<Key,Value>, Cloneable, Serializable
*
* */


package src.java.Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Java {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
