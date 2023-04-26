![](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/c6s5mkc51cof74mrqsr0)

## Annotation 

- Annotation cung cấp một cách để liên kết meta-data (dữ liệu về dữ liệu, chú thích) với các thành phần của chương trình Java 
- Tại thời gian dịch và thời gian chạy. Annotation có thể áp dụng cho package, class, method, constructor, tham chiếu và biến.

## Chức năng của Annotation trong Java:
1. chỉ dẫn cho trình biên dịch (Compiler)
2. chỉ dẫn trong thời điểm biên dịch (Build-time)
3. chỉ dẫn trong thời gian chạy (Runtime)


### 1. Java Annotation được tích hợp để sử dụng trực tiếp trong code Java:
Annotation được dùng như meta-data (chú thích)
- [@Override]() : đánh dấu một phương thức nạp chồng.
- [@Deprecated]() : đánh dấu một phương thức đã lạc hậu. Phải có chú thích kèm theo để giải thích vì sao phương thức lạc
  hậu và cách thay thế có thể.
- [@SuppressWarnings]() : báo trình biên dịch ngăn chặn cảnh báo, có thể chỉ rõ loại cảnh báo, deprecated hoặc unchecked.
  - [@SuppressWarnings(“deprecation”)]() để thông báo trình biên dịch không cảnh báo việc sử dụng phương thức có sử dụng @Deprecated.
  - [@SuppressWarnings(“unchecked”)]() để thông báo trình biên dịch không cảnh báo việc sử một ép kiểu không an toàn.
  - [@SuppressWarnings(“rawtypes”)]() để thông báo trình biên dịch không cảnh báo lỗi trong khai báo kiểu dữ liệu.

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

Java Annotation được tích hợp sẵn được sử dụng trong Annotation khác.
- [@Target]() : sử dụng để chỉ định các đối tượng mà một annotation có thể được áp dụng. Nó giúp giới hạn phạm vi áp dụng của một annotation
  - [ElementType.TYPE](): Áp dụng cho các đối tượng kiểu lớp (class, interface, enum).
  - [ElementType.FIELD](): Áp dụng cho các trường (fields), bao gồm cả các trường cục bộ (local fields).
  - [ElementType.METHOD](): Áp dụng cho các phương thức (methods).
  - [ElementType.PARAMETER](): Áp dụng cho các tham số (parameters) của phương thức hoặc constructor.
  - [ElementType.CONSTRUCTOR](): Áp dụng cho các constructor (hàm khởi tạo) của lớp.
  - [ElementType.LOCAL_VARIABLE](): Áp dụng cho các biến cục bộ (local variables) trong một phương thức hoặc khối mã (block).
  - [ElementType.ANNOTATION_TYPE](): Áp dụng cho các annotation khác.
  - [ElementType.PACKAGE](): Áp dụng cho các gói (packages).
  - [ElementType.TYPE_PARAMETER](): Áp dụng cho các tham số kiểu (type parameters) của các lớp, giao diện hoặc phương thức thông qua generics.
  - [ElementType.TYPE_USE](): Áp dụng cho các loại sử dụng kiểu (type uses), ví dụ như trong khai báo biến, kiểu trả về của phương thức, hoặc trong khai báo đối số của phương thức.

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    // Nội dung của annotation
}
```

### 2. Java Annotation được tích hợp sẵn được sử dụng trong Annotation khác.
- [@Retention]() : Sử dụng để chỉ định thời gian tồn tại của một annotation trong quá trình thực thi của chương trình.
  - [RetentionPolicy.SOURCE](): Annotation chỉ tồn tại trong mã nguồn Java, không được giữ lại trong file biên dịch (compiled bytecode) và không thể truy cập trong thời gian thực thi.
  - [RetentionPolicy.CLASS](): Annotation được giữ lại trong file biên dịch (compiled bytecode), nhưng không được giữ lại trong thời gian thực thi của chương trình Java. Đây là giá trị mặc định của @Retention nếu không được chỉ định.
  - [RetentionPolicy.RUNTIME](): Annotation được giữ lại trong file biên dịch (compiled bytecode) và có thể truy cập và sử dụng trong thời gian thực thi của chương trình Java thông qua Java Reflection API.

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Được giữ lại trong thời gian thực thi
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    // Nội dung của annotation
}
```


- [@Inherited]() : Sử dụng để chỉ định liệu một annotation có được kế thừa từ lớp cha đến lớp con hay không.
```java
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited // Cho phép kế thừa annotation từ lớp cha đến lớp con
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    // Nội dung của annotation
}
```

- [@Documented]() : Sử dụng để đánh dấu một annotation khác, cho phép nó được ghi vào tài liệu (documentation) của mã nguồn.
```java
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented // Cho phép annotation này được ghi vào tài liệu
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    // Nội dung của annotation
}
```



## Khởi tạo Annotation (Annotation tự định nghĩa):
Annotation khá giống một interface, để khai báo một Annotation chúng ta sử dụng @interface. 

Một phần tử của Annotation có các đặc điểm như sau:

1. Không có thân hàm
2. Không có tham số hàm
3. Khai báo trả về phải là một kiểu dữ liệu cụ thể (Kiểu nguyên thủy, Enum, Annotation hoặc Class).
4. Có thể có giá trị mặc định.


Mình sẽ tạo 3 custom annotation với mục tiêu tuần tự hóa một đối tượng thành một chuỗi JSON
1. Sử dụng cho phạm vi Class
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)  //Sử dụng cho phạm vi Class
public @interface MyAnnotationClass {
}
```

2. Sử dụng cho phạm vi method
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)  //Sử dụng cho phạm vi method
public @interface MyAnnotationMethod {
}
```

3. Sử dụng cho phạm vi field
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //Sử dụng cho phạm vi các trường
public @interface MyAnnotationField {
    public String key() default "";
}
```


















