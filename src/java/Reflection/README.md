
## Java Reflection:
Java Reflection là một quá trình kiểm tra hoặc sửa đổi hành vi thời gian chạy của một lớp trong thời gian chạy.

Một số điểm về Reflection trong Java là:
- Các lớp cần thiết để phản chiếu trong Java có trong gói java.lang.reflect.
- Reflection cung cấp cho chúng ta các dữ liệu về lớp với các đối tượng  liên kết và phương thức cho lớp đó.
- Thông qua sự phản chiếu, chúng ta có thể gọi một phương thức tại thời gian chạy độc lập với trình xác định truy cập của chúng


Reflection API của Java chủ yếu được sử dụng trong:
- IDE như Eclipse, MyEclipse, NetBean,....
- Trình gỡ lỗi
- Công cụ kiểm tra


Các phương thức thường được sử dụng của lớp Class:

| Phương thức                                                         | Mô tả                                                                   |
|---------------------------------------------------------------------|-------------------------------------------------------------------------|
| public String getName()                                             | Trả lại tên của lớp                                                     |
| public static Class forName(String className)                       | Phương thức này tải lớp và trả lại tham chiếu của lớp                   |
| public Object newInstance()                                         | Nó tạo nên một đối tượng mới của lớp                                    |
| public boolean isInterface()                                        | Phương thức này kiểm tra xem liệu nó có phải là một giao diện hay không |
| public boolean isArray()                                            | Phương thức này kiểm tra xem liệu nó có phải một mảng hay không         |
| public boolean isPrimitive()                                        | Phương thức này kiểm tra xem liệu nó có phải nguyên thủy hay không      |
| public Class getSuperclass()                                        | Nó trả về siêu lớp hoặc tham chiếu lớp cha                              |
| public Field[] getDeclaredFields()                                  | Nó trả về tổng số fields trong lớp                                      |
| public Method[] getDeclaredMethods()                                | Nó trả lại tổng số phương thức của lớp                                  |
| public Method getDeclaredMethod(String name,Class[] parameterTypes) | Phương thức này trả lại phương thức lớp instance                        |
| public Constructor[] getDeclaredConstructors()                      | Nó trả lại tổng số hàm tạo của  lớp                                     |



## Cách lấy đối tượng của lớp Class của Reflection trong Java:
Có ba cách lấy đối tượng của lớp Class như sau:


### Phương thức của lớp Class forName()
```java
class Demo {}

class Test {
  public static void main(String args[]) {
    try {
      Class c = Class.forName("Demo");
      System.out.println(c.getName());
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}

// => Output: Demo
```

### Phương thức của lớp Object getClass():
```java
class Demo {}

class Test {
  void printName(Object obj) {
    Class c = obj.getClass();
    System.out.println(c.getName());
  }

  public static void main(String args[]) {
    Demo obj = new Demo();
    Test t = new Test();
    t.printName(obj);
  }
}

// => Output: Demo
```

### Cú pháp .class
```java
class Demo {
  public static void main(String args[]) {
    Class c1 = boolean.class;
    System.out.println(c1.getName());
    Class c2 = Demo.class;
    System.out.println(c2.getName());
  }
}

// Output: boolean
```





