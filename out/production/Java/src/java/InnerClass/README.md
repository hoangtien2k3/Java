
# Java Inner Classes (Nested Classes) là gì ?

> **Java Inner Class** là một lớp nằm trong một lớp khác. Nó được sử dụng để giải quyết các vấn đề gắn liền với lớp bên trong, và cung cấp một cách linh hoạt để truy cập các thành phần của lớp bên ngoài. Loại inner class trong Java:


| Type                                                                      | 	Description                                                                                                          |
|---------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| [Member Inner Class](https://www.javatpoint.com/member-inner-class)       | Một lớp được tạo ra bên trong một lớp và bên ngoài phương thức.                                                       |
| [Anonymous Inner Class](https://www.javatpoint.com/anonymous-inner-class) | Một lớp được tạo ra để implements interface hoặc extends class. Tên của nó được quyết định bởi trình biên dịch java.. |
| [Local Inner Class](https://www.javatpoint.com/local-inner-class)         | 	Một lớp được tạo ra bên trong một phương thức.                                                                       |
| [Static Nested Class](https://www.javatpoint.com/static-nested-class)     | Một lớp static được tạo ra bên trong một lớp.                                                                         |
| [Nested src.java.JavaCore.Interface](https://www.javatpoint.com/nested-interface)           | 	Một interface được tạo ra bên trong một lớp hoặc một interface.                                                      |



## Lợi ích Inner Class Java:
Trong Java, member inner class là một loại inner class được định nghĩa trong một lớp bên trong một lớp khác. Member inner class cung cấp một số lợi ích sau:

1. Tổ chức mã: Member inner class giúp tổ chức mã tốt hơn bằng cách gom các phần liên quan trong một lớp.

2. Truy cập vào các thành viên private của lớp cha: Member inner class có thể truy cập đến các thành viên private của lớp cha, giúp cho việc sử dụng dữ liệu từ lớp cha trở nên dễ dàng hơn.

3. Tạo ra các đối tượng của lớp cha: Member inner class có thể tạo ra đối tượng của lớp cha, giúp cho việc sử dụng các thuộc tính và phương thức của lớp cha trở nên dễ dàng hơn.

4. Tạo ra các đối tượng độc lập: Member inner class cũng có thể tạo ra các đối tượng độc lập, giúp cho việc tái sử dụng mã trở nên dễ dàng hơn.



## *Member inner class* trong java:
Định nghĩa và cú pháp:

- Member Inner Class là một loại Inner Class trong Java được tạo bên trong một lớp và có thể truy cập và sử dụng các thuộc tính và phương thức của lớp chính. Nó có thể được truy cập từ bất kỳ đâu trong lớp chính và có thể sử dụng các thuộc tính và phương thức của lớp chính.

#### Cú pháp để tạo một *Member Inner Class* trong Java như sau:

```java
class OuterClass {
   ...
    class InnerClass {
      ...
    }
}
```

Để sử dụng một Member Inner Class, bạn cần tạo một đối tượng của lớp ngoài trước, sau đó sử dụng nó để tạo một đối tượng của Member Inner Class. Ví dụ:

```java
OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
```

- Cần lưu ý rằng, Member Inner Class có thể truy cập các thuộc tính và phương thức của lớp chính nhưng không có quyền truy cập các biến static của lớp chính.


## *Anonymous inner class* trong java:
#### *Định nghĩa*:
- Anonymous inner class là một loại inner class trong Java mà không có tên. Nó được sử dụng khi bạn cần tạo một lớp con nội tại trong một phương thức hoặc trong một khối lệnh.

##### Cú pháp tạo một Anonymous inner class như sau:
```java
new ParentClassOrInterface() {
        // body of anonymous inner class
        };
```

#### Ví Dụ:
```java
Button button = new Button("Click me");
        button.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
        System.out.println("Button is clicked");
        }
        });
```

Trong ví dụ trên, chúng ta tạo một anonymous inner class để xử lý sự kiện khi nút được nhấn. Anonymous inner class là một cách tiện lợi để tạo một lớp con nội tại mà không cần đặt tên cho nó.


## *Local inner class* trong java:

Định nghĩa:
- Local Inner Class là một lớp bên trong được khai báo trong một phương thức của lớp bên ngoài. Nó chỉ có thể truy cập các biến cục bộ của phương thức đó và không thể truy cập các biến instance của lớp bên ngoài.

Ví Dụ:

```java
class OuterClass {
   int x = 10;
   
   void method() {
      int y = 20;
      
      class LocalInnerClass {
         void display() {
            System.out.println(x + y);
         }
      }
      LocalInnerClass inner = new LocalInnerClass();
      inner.display();
   }
}
```

Trong ví dụ trên, lớp LocalInnerClass là một lớp bên trong được khai báo trong phương thức method của lớp OuterClass. Nó có thể truy cập biến y của phương thức method nhưng không thể truy cập biến x của lớp OuterClass.

#### Lớp nội được tạo ra bởi trình biên dịch:
```java
import java.io.PrintStream;
 
class LocalInner1$Local {
    final LocalInner1 this$0;
 
    LocalInner1$Local() {
        super();
        this$0 = Simple.this;
    }
 
    void msg() {
        System.out.println(LocalInner1.access$000(LocalInner1.this));
    }
}
```


## *Static nested class* trong java:

Định nghĩa:

- Static Nested Class là một lớp bên trong được khai báo dưới dạng static trong một lớp bên ngoài. Nó có thể truy cập các biến static của lớp bên ngoài và các biến instance của lớp bên ngoài.

> + Nó có thể truy cập các thành viên dữ liệu tĩnh của lớp ngoài bao gồm cả private.
> + Static nested class không thể truy cập thành viên dữ liệu hoặc phương thức non-static (instance).


Ví dụ:
```java
class OuterClass {
   static int x = 10;
   
   static class NestedStaticClass {
      void display() {
         System.out.println(x);
      }
   }
}
```

Trong ví dụ trên, lớp NestedStaticClass là một lớp bên trong được khai báo dưới dạng static trong lớp OuterClass. Nó có thể truy cập biến static x của lớp OuterClass.

#### Lớp nội bộ được trình biên dịch tạo ra:
```java
import java.io.PrintStream;
 
static class TestOuter1$Inner {
    TestOuter1$Inner() {
    }
 
    void msg() {
        System.out.println((new StringBuilder()).append("data is ")
                .append(TestOuter1.data).toString());
    }
}
```


## *Nested src.java.JavaCore.Interface* trong java:

Định nghĩa:

- Nested src.java.JavaCore.Interface trong Java là một giao diện bên trong được khai báo trong một lớp hoặc giao diện bên ngoài. Nó có thể truy cập những biến static và các phương thức định nghĩa tại lớp hoặc giao diện bên ngoài.

```java
class OuterClass {
   interface NestedInterface {
      void display();
   }
}
```

=> Trong ví dụ trên, giao diện NestedInterface được khai báo trong lớp OuterClass. Nó có thể truy cập các biến static và phương thức định nghĩa trong lớp OuterClass.

#### Khai báo nested interface bên trong interface:
```java
interface interface_name {
    // code
    interface nested_interface_name {
        // code
    }
}
```

#### Khai báo nested interface bên trong class:
```java
class class_name {
    // code
    interface nested_interface_name {
        // code
    }
}
```

#### Ví dụ về nested interface được khai báo bên trong interface:
```java
interface Showable {
    void show();
 
    interface Message {
        void msg();
    }
}
 
class TestNestedInterface1 implements Showable.Message {
    public void msg() {
        System.out.println("Hello nested interface");
    }
 
    public static void main(String args[]) {
        Showable.Message message = new TestNestedInterface1(); // upcasting
        message.msg();
    }
}
```

### Tóm tắt *Ưu* và *Nhượng* Inner Class Java:

> #### Các ưu điểm của Inner Class trong Java:

1. Sự riêng tư: Inner class có thể truy cập các thành viên private của lớp bên ngoài mà các lớp khác không thể truy cập.

2. Sự tổng hợp: Inner class có thể tổng hợp các thành viên của lớp bên ngoài.

3. Sự linh hoạt: Inner class cho phép ta tạo nhiều đối tượng bên trong một lớp bên ngoài.


> #### Nhượng điểm của Inner Class trong Java:

1. Sự phức tạp: Sự sử dụng của inner class có thể làm cho code phức tạp hơn và khó hiểu hơn.

2. Sự trễ nảo: Tạo đối tượng cho inner class có thể chậm hơn so với tạo đối tượng cho một lớp bình thường.

3. Sự không tự do: Inner class chỉ có thể được sử dụng trong lớp bên ngoài, nó không thể được sử dụng một cách độc lập.


### Tài liệu tham khảo: 

Link Github : [https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_Inner_Class](https://github.com/hoangtien2k3qx1/Java/tree/main/JavaCore/Java_Inner_Class)

JavaPoint: [https://www.javatpoint.com/java-inner-class](https://www.javatpoint.com/java-inner-class)




