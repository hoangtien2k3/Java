
# Java Core:
#### JAVA CORE là kiến thức nền tảng của ngôn ngữ lập trình JAVA...

<img align = "right" alt = "Coding" width = "400" src="https://cdn.mindmajix.com/blog/images/core-java-0604.png">

- #### Java Core:
    - [*Java Array*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_Array)
    - [*Java Collection*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_Collections)
    - [*Java Input-Output*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_Input_Output)
    - [*Java Regex*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_Regex)
    - [*Java String*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_String)
    - [*Java Math*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Math_class)
    - [*Java Serialization*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_Serialization)
    - [*Exception Handling*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Exception_Handling)
    - [*Sorting Collections*](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Sorting_Collections)
  

## So sánh giữa toán tử '==' và 'equals()' trong java:
1. Biến tham trị và tham chiếu.
- Khi sử dụng biến kiểu tham trị, JAVA chỉ cho phép bạn sử dụng toán tử so sánh [“==”]().
- Khi sử dụng biến kiểu tham chiếu, JAVA cho phép sử dụng cả toán tử [“==”]() và [equals()]().

Note:
- toán tử “==”, bộ xử lý của JAVA sẽ so sánh xem 2 biến tham chiếu này có trỏ đến cùng một đối tượng hay không.
- phương thức "equals()", [(mặc định bộ nhớ JAVA sẽ so sánh xem 2 biến tham chiếu này có trỏ đến cùng một vùng nhớ hay không)](). Chúng ta cũng có thể định nghĩa lại phương thức 'equals()' để bộ xử lý JAVA sẽ so sánh giá trị của 2 biến tham chiếu đó.


```java
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        return this.age == ((Person) obj).age && this.name.equals(((Person) obj).name);
    }
}
```

```java
public class Object_Java {
    public static void main(String[] args) {
        Person person1 = new Person("tien", 20);
        Person person2 = new Person("tuan", 19);
        Person person3 = new Person("tien", 20);
        Person person4 = person1;
        
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person4));
    }
}
```



## Lớp bao:
1. Lớp bao (wrapper class)
2. Autoboxing
```java
int p1 = 420;
Integer p1W = p1; // autoboxing
int p2 = p1W; // autounboxing
```

```java
// auto-boxing
List list = new ArrayList();
list.add(100); // list.add(new Integer(100));
Byte b = 100; // chuyển int thành byte, rồi boxing byte thành Byte
// auto-unboxing
while (Boolean.TRUE) { ... }
if (new Integer(2) > 1) { ... }
int i = 10 + new Integer(2) * 3;
```




























