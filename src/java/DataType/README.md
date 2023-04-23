
## Reference Data Type and Grabage Collector


### I. Memory Leak:
Memory Leak là một hiện tượng khi bộ nhớ được sử dụng bởi chương trình không giải phóng sau khi không còn được sử dụng nữa.




### II. Grabage Collector:

Garbage Collector là một phần của máy ảo Java (JVM) và được sử dụng để thu dọn bộ nhớ tự động

Garbage Collector sẽ kiểm tra và quản lý bộ nhớ được cấp phát động trong chương trình Java, xoá các đối tượng không còn được sử dụng và giải phóng bộ nhớ của chúng.

#### Hoạt động: 
1. [Duyệt bộ nhớ](): Garbage Collector sẽ duyệt qua tất cả các đối tượng được cấp phát trong bộ nhớ và xác định xem đối tượng nào không còn được sử dụng.
2. [Xoá các đối tượng không còn được sử dụng](): Sau khi xác định các đối tượng đã không còn được sử dụng, Garbage Collector sẽ xoá chúng khỏi bộ nhớ.
3. [Giải phóng bộ nhớ](): Sau khi xoá các đối tượng không còn được sử dụng, Garbage Collector sẽ giải phóng bộ nhớ được cấp phát cho các đối tượng đó, và chuyển nó trở lại vào bộ nhớ sẵn sàng cho việc cấp phát các đối tượng mới.

![](https://i.imgur.com/ciR7pzT.png)



### III. Reference Data Type:

1. [Strong Reference (tham chiếu mạnh)](): Strong reference là một tham chiếu trực tiếp đến một đối tượng, Bất kỳ đối tượng nào đang được giữ Strong Reference thì GC sẽ không thể giải phóng được đối tượng đó. Đối tượng chỉ có thể được giải phóng khi được gán giá trị null
```java
MyClass obj = new MyClass ();
```
![](https://i.imgur.com/xsR6K9I.png)


2. [Weak Reference (tham chiếu yếu)](): Weak reference được sử dụng để theo dõi các đối tượng mà chúng ta không muốn giữ lại trong bộ nhớ khi chúng không được tham chiếu bởi bất kỳ strong reference nào. Weak reference có thể được sử dụng để giúp cho việc tạo ra cache hoặc bộ nhớ đệm với các đối tượng, mà không cần gây ra lỗi out of memory khi số lượng đối tượng tăng quá nhiều.
```java
// Khởi tạo đối tượng và tạo một weak reference.
WeakReference<Person> weakRef = new WeakReference<>(new Person("John"));

// Lấy đối tượng từ weak reference.
Person person = weakRef.get();

// Kiểm tra xem đối tượng đã bị loại bỏ hay chưa.
if (person == null) {
    System.out.println("Person has been Garbage Collected");
}
```
![](https://i.imgur.com/yRS8YTq.png)


3. [Soft Reference (tham chiếu mềm)](): Weak Reference nhưng điểm khác ở chỗ nếu weak reference sẽ được giải phóng bộ nhớ ngay nhưng đối với Soft Reference thì phải đến khi bộ nhớ thấp. Khi JVM văng ra out of memory thì tham chiếu mềm đó mới được giải phóng.
```java
// Khởi tạo đối tượng và tạo một soft reference.
SoftReference<Person> softRef = new SoftReference<>(new Person("John"));

// Lấy đối tượng từ soft reference.
Person person = softRef.get();

// Sử dụng đối tượng.
person.doSomething();
```

4. [Phantom Reference (tạm dịch là tham chiếu ma)](): Phantom reference cũng được sử dụng để theo dõi các đối tượng nhưng không giữ lại được bất kỳ đối tượng nào. Phantom reference được sử dụng để theo dõi việc thu hồi một đối tượng và thực hiện một số hoạt động ngay trước hoặc sau khi đối tượng đó bị Garbage Collector thu hồi.
```java
// Tạo một đối tượng và một phantom reference.
Person person = new Person("John");
ReferenceQueue<Person> queue = new ReferenceQueue<>();
PhantomReference<Person> phantomRef = new PhantomReference<>(person, queue);

// kiểm tra đối tượng đã bị loại bỏ hay chưa.
boolean isRemoved = false;
while (!isRemoved) {
    System.gc();
    Reference<?> ref = queue.poll();
    if (ref == phantomRef) {
        System.out.println("Object has been Garbage Collected");
        isRemoved = true;
    }
}
```









