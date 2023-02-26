
## WILDCARD - GENERIC TRONG JAVA  
ký tự đại diện <?> được gọi là wildcard

Wildcard là một ký hiệu đặc biệt được sử dụng trong kiểu Generics để cho phép một phương thức hoặc lớp có thể làm việc với nhiều kiểu dữ liệu khác nhau mà không cần xác định kiểu dữ liệu chính xác.


### Có hai loại Wildcard trong Java:
- Unbounded Wildcard.
- Bounded Wildcard.

#### 1. [Unbounded Wildcard]()
Unbounded Wildcard biểu thị bằng ký hiệu dấu ?, và cho phép các giá trị của bất kỳ kiểu dữ liệu nào được chấp nhận.

```JAVA
//  ký tự đại diện <?> chấp nhận bất kỳ kiểu dữ liệu nào. 
public void printList(List<?> list) {
    for (Object elem : list)
        System.out.println(elem + " ");
    System.out.println();
}
```


#### 2. [Bounded Wildcard]()
Bounded Wildcard giới hạn kiểu dữ liệu được sử dụng bằng cách sử dụng một từ khóa giới hạn để giới hạn kiểu dữ liệu được sử dụng.

Có hai loại giới hạn:
- Upper bounded wildcard.
- Lower bounded wildcard.

[Upper bounded wildcard](): giới hạn kiểu dữ liệu phải là lớp con của một lớp cụ thể.
```java
// Ký tự đại diện <? extends type> chấp nhận bất ký đối tượng nào miễn là đối tượng này kế thừa từ type hoặc đối tượng của type
public void printList(List<? extends Number> list) {
    for (Number elem : list)
        System.out.println(elem + " ");
    System.out.println();
}
```

[Lower bounded wildcard](): giới hạn kiểu dữ liệu phải là lớp cha của một lớp cụ thể.
```java
// Ký tự đại diện <? super type> chấp nhận bất ký đối tượng nào miễn là đối tượng này là cha của type hoặc đối tượng của type
public void addList(List<? super Integer> list) {
    for (int i = 1; i <= 10; i++) {
        list.add(i);
    }
}
```
