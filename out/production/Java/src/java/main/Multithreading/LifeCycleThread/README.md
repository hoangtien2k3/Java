
#### [*Life cycle of a Thread (Thread States)*](https://viettuts.vn/java-thread/vong-doi-cua-thread-trong-java)

> **New** : Mới khởi tạo, chưa được đưa vào queue.
>
> **Runnable** : Được đưa vào queue, chờ được thực thi.
> 
> **Running** : Đang được thực thi bởi processor.
> 
> **Blocked** : Bị dừng thực thi vì một vài lý do.
> 
> **Terminated** : Về với đất mẹ.


## 1. New
   Khi khai báo mới một thread, nó sẽ có state New. Lưu ý là chưa start thread. Ví dụ, khai báo thread với Java 11:
```java
final var firstThread = new Thread(() -> System.out.println("First thread"));
final var secondThread = new Thread(() -> System.out.println("Second thread"));
```


## 2. Runnable
Một vài ngôn ngữ lập trình yêu cầu chúng ta bắt buộc phải start thread một cách thủ công trong đó có Java. Chạy dòng code bên dưới:

```JAVA
firstThread.start();
secondThread.start();
```

Sau khi start thread, nó sẽ được đưa vào ready queue, nhiệm vụ tiếp theo là của OS (bài trước). Chúng ta không biết thread thật sự được thực thi khi nào, thời gian thực thi là bao lâu.

- Kết quả có thể là:
```java
First thread
Second thread
```

- hoặc:
```java
Second thread
First thread
```

## 3. Waiting
Mình thích những điều thực tế nên lấy ví dụ trước.

Chắc ai cũng đã từng chờ bạn gái (ít thì 30 phút, nhiều thì 1 vài giờ) để đưa đi.. đâu cũng được. Chàng trai (gọi tắt là B) và cô gái (gọi tắt là G), B đến đón G đi chơi cuối tuần.

> B: Em sắp xong chưa, anh đến rồi!

> G: Chờ em một chút, em xuống ngay.

Cụ thể với implementation, thread sẽ rơi vào trạng thái Waiting khi gọi các method:

```java
object.wait();
thread.join();
LockSupport.park();
```





