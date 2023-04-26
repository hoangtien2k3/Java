
## Từ khóa static trong java:
- Từ khóa static được sử dụng để quản lý bộ nhớ tốt hơn và nó có thể được truy cập trực tiếp thông qua lớp mà không cần khởi tạo.
- Từ khóa static thuộc về lớp chứ không thuộc về instance (thể hiện) của lớp.
- Từ khóa static với các biến, các phương thức, các khối, các lớp lồng nhau(nested class).


## Các trường hợp sử dụng static:
1. [Biến static (static variables)](): thì biến đó được gọi là biến tĩnh, hay biến static.
2. [Phương thức static (static methods)](): thì phương thức đó gọi là phương thức static.
3. [Khối static (static blocks)](): được sử dụng để khởi tạo thành viên dữ liệu static.
4. [Lớp static (static class)](): 
    - Một class được có thể được đặt là static chỉ khi nó là một nested class.
    - Một  nested static class có thể được truy cập mà không cần một object của outer class (lớp bên ngoài).
5. [Import static](): cho phép import các thành viên tĩnh (static member) của một class hoặc package vào một class khác và sau đó sử dụng chúng như là thành viên của lớp đó.


### 1. Biến static (static variables) trong Java:
- Biến static có thể được sử dụng làm thuộc tính chung, để dùng chung dữ liệu cho tất cả objects (hoặc instances ) của lớp đó và điều đó giúp cho chương trình tiết kiệm bộ nhớ hơn
```java
public static final PI = 3.14;
```

### 2. Phương thức static (static methods):
Một số đặc điểm:
- Một phương thức **static** thuộc lớp chứ không phải đối tượng của lớp.
- Một phương thức **static** có thể được gọi mà không cần tạo khởi tạo (instance) của một lớp.
- Phương thức **static** có thể truy cập biến static và có thể thay đổi giá trị của nó.
- Một phương thức **static** chỉ có thể gọi một phương thức static khác, không thể gọi được một phương thức non-static.
- Một phương thức **static** không thể được sử dụng từ khóa [this]() và [super]().
- Người dùng không thể override (đè) phương thức static trong Java.
```java
public class UsingStaticExample {
    public static void changeWebsite(String website) {
        MyWebsite.WEBSITE = website;
    }

    public static void main(String[] args) {
        UsingStaticExample.changeWebsite("https://gpcoder.com");
        ex1.print();
    }
}
```


### 3. Khối static (static blocks):
- Khối **static** được dùng để khởi tạo hoặc thay đổi giá trị của các biến static.
- Nó được thực thi trước phương thức main tại thời gian tải lớp.
- Một class có thể có nhiều [static blocks]().
```java
public class UsingStaticExample {
    private static String subject;

    public static ArrayList<Fruit> fruits;
    static {
        fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Guava"));
    }

    static {
        System.out.println("Khối static được gọi");
    }

    static {
        subject = "Khối static (static blocks)";
    }
    
    UsingStaticExample () {
        System.out.println("hàm main() được gọi");
        System.out.println("Subject = " + subject);
    }
    public static void main(String[] args) {
        UsingStaticExample ex1 = new UsingStaticExample();
    }
}
```


### 4. Lớp static (static class):
- Một class được có thể được đặt là static chỉ khi nó là một nested class.
- Một  nested static class có thể được truy cập mà không cần một object của outer class (lớp bên ngoài).
```java
public class UsingStaticExample {
    private String subject;

    UsingStaticExample (String subject) {
        this.subject = subject;
    }

    // nested static class
    static class MyWebsite {
        public static String WEBSITE = "gpcoder.com";
    }

    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + MyWebsite.WEBSITE);
    }

    public static void main(String[] args) {
        UsingStaticExample ex1 = new UsingStaticExample("Core Java");
        ex1.print();
    }
}
```


### 5. Import static trong Java:
- Java cho phép import các thành viên tĩnh (static member) của một class hoặc package vào một class khác.
```java
public final class SystemConfig {

    public static final String USER_NAME = "hoangtien2k3";
    public static final String PASSWORD = "12345";
    public static final String EMAIL = "hoangtien2k3qx1@gmail.com";

    private SystemConfig() {
    }
}

public class StaticImportDemo {
   public static void main(String[] args) {
      System.out.println("Username: " + USER_NAME);
      System.out.println("Password: " + PASSWORD);
      System.out.println("Email: " + EMAIL);
   }
}
```
