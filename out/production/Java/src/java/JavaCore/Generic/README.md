
## WILDCARD - GENERIC TRONG JAVA  
Trong Java, Wildcard là một ký hiệu đặc biệt được sử dụng trong kiểu Generics để cho phép một phương thức hoặc lớp có thể làm việc với nhiều kiểu dữ liệu khác nhau mà không cần xác định kiểu dữ liệu chính xác.

Wildcard được biểu thị bằng ký hiệu dấu ? và có thể được sử dụng trong khai báo kiểu của một đối tượng, một lớp hoặc một phương thức


### Có hai loại Wildcard trong Java:
- Unbounded Wildcard.
- Bounded Wildcard.

#### 1. [Unbounded Wildcard]()
Unbounded Wildcard biểu thị bằng ký hiệu dấu ?, và cho phép các giá trị của bất kỳ kiểu dữ liệu nào được chấp nhận.

```JAVA
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
public void printList(List<? extends Number> list) {
    for (Number elem : list)
        System.out.println(elem + " ");
    System.out.println();
}
```

[Lower bounded wildcard](): giới hạn kiểu dữ liệu phải là lớp cha của một lớp cụ thể.
```java
public void addList(List<? super Integer> list) {
    for (int i = 1; i <= 10; i++) {
        list.add(i);
    }
}
```

![image](https://user-images.githubusercontent.com/122768076/220159590-c846c503-18c7-4427-b1b2-ac6a4d59517d.png)
