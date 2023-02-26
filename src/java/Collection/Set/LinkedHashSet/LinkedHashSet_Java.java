/*
*   => LinkedHashSet_Java trong java
*
*   * Lớp LinkedHashSet_Java trong java là một bản cài đặt bảng băm và danh sách liên kết của giao diện Set.
*     Nó kế thừa lớp HashSet và implements giao diện Set.
*

    Những điểm quan trọng về lớp LinkedHashSet_Java trong java là:

        + LinkedHashSet chỉ chứa các phần tử duy nhất, không chấp nhận 2 phần tử trùng nhau.

        + LinkedHashSet đảm bảo thứ tự được thêm vào.

        + LinkedHashSet sử dụng đối tượng LinkedHashMap nội bộ để lưu trữ và xử lý các phần tử của nó.

        + LinkedHashSet cho phép chứa phần tử NULL.

        + LinkedHashSet không được đồng bộ. Để có LinkedHashSet đồng bộ, hãy sử dụng phương thức Collections.
          synchronizedSet ().
*
*
*

*   * Lớp java.util.LinkedHastSet được định nghĩa như sau:
*
    *           public class LinkedHashSet<E> extends HashSet<E>
                    implements Set<E>, Cloneable, java.io.Serializable {

                    private static final long serialVersionUID = -2851667679971038690L;

                    public LinkedHashSet(int initialCapacity, float loadFactor) {
                        super(initialCapacity, loadFactor, true);
                    }
                }
*
*
* */

package src.java.Collection.Map.HashMap.LinkedHashSet;

import java.util.LinkedHashSet;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() { // trong LinkedHashSet phải dùng thêm hàm hashCode
         return this.id;
    }
}


public class LinkedHashSet_Java {
    public static void main(String[] args) {
        LinkedHashSet<Book> hs=new LinkedHashSet<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);

        //Traversing hash table
        for(Book b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }


        System.out.println("\nsau khi xoa: ");
        hs.remove(b1);


        for(Book b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }



    }
}
