
# Java Inner Classes (Nested Classes)

| Type                                                                      | 	Description                                                                                          |
|---------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| [Member Inner Class](https://www.javatpoint.com/member-inner-class)       | A class created within class and outside method.                                                      |
| [Anonymous Inner Class](https://www.javatpoint.com/anonymous-inner-class) | A class created for implementing an interface or extending class. The java compiler decides its name. |
| [Local Inner Class](https://www.javatpoint.com/local-inner-class)         | A class was created within the method.                                                                |
| [Static Nested Class](https://www.javatpoint.com/static-nested-class)     | A static class was created within the class.                                                          |
| [Nested Interface](https://www.javatpoint.com/nested-interface)           | 	An interface created within class or interface.                                                                                                      |



## *Member inner class* trong java
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



