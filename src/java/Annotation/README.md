
## Annotation 

- Annotation cung cấp một cách để liên kết meta-data (dữ liệu về dữ liệu, chú thích) với các thành phần của chương trình Java 
- Tại thời gian dịch và thời gian chạy. Annotation có thể áp dụng cho package, class, method, constructor, tham chiếu và biến.

## Chức năng của Annotation trong Java:
1. chỉ dẫn cho trình biên dịch (Compiler)
2. chỉ dẫn trong thời điểm biên dịch (Build-time)
3. chỉ dẫn trong thời gian chạy (Runtime)


### Annotation có các loại:
Annotation tạo sẵn:

Annotation được dùng như meta-data (chú thích)
- [@Override]() : đánh dấu một phương thức nạp chồng.
- [@Deprecated]() : đánh dấu một phương thức đã lạc hậu. Phải có chú thích kèm theo để giải thích vì sao phương thức lạc
  hậu và cách thay thế có thể.
- [@SuppressWarnings]() : báo trình biên dịch ngăn chặn cảnh báo, có thể chỉ rõ loại cảnh báo, deprecated hoặc unchecked.
```java
public interface House {
    /**
    * @deprecated use of open is discouraged,
    * use openDoor instead.
    */
    @Deprecated
    public void open();
    public void openDoor();
}
public class MyHouse implements House {
    @SuppressWarnings("deprecation")
    @Override 
    public void open() { }
    @Override 
    public void openDoor() { }
}
```

- [@SafeVarargs]() : khẳng định phương thức không thực hiện các hoạt động có thể gây mất an toàn trên tham số của nó.
- [@FunctionalInterface]() : đánh dấu một interface dự kiến dùng cho biểu thức Lambda (interface chỉ có một phương thức).

Annotation được dùng như meta-annotation:
- [@Rentation]() : chỉ định cách một annotation kiểu marker(không tham số) được giữ lại.
- [@Documented]() : chi định một annotation sẽ có mặt trong Javadoc (mặc định annotation không có trong Javadoc).
- [@Target]() : chú thích một annotation là hạn chế áp dụng với thành phần Java nào đó.
- [@Inherited]() : chú thích một annotation được thừa kế từ lớp cha nào đó.
- [@Repeatable]() : chỉ định một annotation kiểu marker được áp dụng nhiều lần trong cùng một khai báo.


Annotation định nghĩa bởi người phát triển, gọi là annotation tùy biến, có ba kiểu: marker (không tham số), single value (một tham số) và multi value (nhiều tham số).
```java
@Retention(RetentionPolicy.RUNTIM) // annotation được JVM giữ lại để dùng trong môi trường chạy
    public @interface Feedback { } // marker
    public @interface Feedback { // single value
    String reportName();
}
public @interface Feedback { // multi value
    String reportName();
    String comment() default "None"; // thiết lập trị mặc định
}
```

Dùng annotation tùy biến như sau:

+ Đặt trực tiếp trước mục được áp dụng annotation:
> @Feedback(reportName="Report 1")
  public void myMethod() { ... }
+ Chương trình có thể kiểm tra sự tồn tại của annotation: 
> Feedback fb = myMethod.getAnnotation(Feedback.class);
- Annotation do bên thứ ba cung cấp, thường là các annotation chú thích kiểu, 
>ví dụ @NotNull.