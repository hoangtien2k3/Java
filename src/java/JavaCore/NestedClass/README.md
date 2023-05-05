
## Nested Class

Nested class là một class được khai báo bên trong một class khác:
```java
class OuterClass {
    class InnerClass {
        ... implment something ....
    }
}
```

Nested class được phân chia thành 2 loại:
+ static nested classes
+ non-static nested classes.

### 1. Static Nested Classes: à class được khai báo dạng static bên trong một class khác,
```java 
class OuterClass {
      static class StaticInnerClass {
            ... implment something ....
      }
}
```

### 2. Non-static Nested Classes: 
+ Innser classes
+ Local classes
+ Anonymous Classes


#### [Inner Classes](): là khai bao một class không phải dạng static bên trong một class khác.
```java
public class OuterClass {
    private int x = 10;
    
    // inner class
    class InnerClass {
        public void printf() {
            System.out.println("The value of x is " + x);
        }
    }
}
```

#### [Local Classes](): là khai báo một class bên trong một method khác.
```java
public class OuterClass {
    
    // phương thức của lớp OuterClass
    public String sayHello(String name) {
        int cnt = 0;    // mặc đinh default int cnt = 0;
        
        // local class 
        class WelcomeMessage {
            WelcomeMessage(){
                System.out.println(cnt); //Only use, can't change
            }
            String getMessage() {
                return "Welcome";
            }

            void showName(){//Only valid from Java 8
                System.out.println(name);
            }
        }
        
        WelcomeMessage msg = new WelcomeMessage();
        return msg.getMessage() + " " + name + " to the Java world !";
    }

    
    // hàm main
    public static void main(String[] args) {
        System.out.println(new OuterClass().sayHello("John"));
    }
        
}
```

1. Local Classes chỉ có thể được khai báo trong một phương thức hay một block code (một cặp ngoặc nhọn {}).
2. Local Classes không thể truy cập từ bên ngoài phương thức hoặc block code chứa nó.
3. Local Classes có thể sử dụng các biến cục bộ (local variables), biến final hoặc tham số của phương thức hoặc block code chứa nó.
4. Local Classes có thể sử dụng các biến static, final hoặc method static của Outer Class.
5. Local Classes không thể khai báo các biến instance.
6. Local Classes có thể implement các interface hoặc kế thừa từ lớp khác.
7. Local Classes có thể được truyền vào dưới dạng tham số của hàm hoặc được sử dụng trong các hàm.
8. Mã nguồn được đơn giản hóa hơn khi sử dụng Local Classes thay vì tạo ra một lớp mới.
9. Việc sử dụng Local Classes làm cho code trở nên dễ đọc và tái sử dụng hơn.
10. Nên sử dụng Local Classes đúng cách và chỉ khi nó thực sự cần thiết để hạn chế làm cho mã nguồn trở nên khó đọc và khó bảo trì


#### [Anonymous Classes](): nó được khai bao bên trong class hoặc method mà không có tên cụ thể.

```java
public class OuterClass {

    interface Person {
        String getName();
    }
    
    public void hello(){
        // Anonymous Classes
        Person john = new Person(){
            @Override 
            public String getName() {
                return "Johnny";
            }
        };
        System.out.println(john.getName());
    }
    
    public static void main(String[] args) {
        new OuterClass().hello();
    }
    
}
```


















