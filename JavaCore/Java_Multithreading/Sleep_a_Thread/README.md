
## Phương thức sleep trong java

#### Link: [Sleep a thread](https://kungfutech.edu.vn/bai-viet/java/su-dung-sleep-va-join-trong-java)

Phương thức sleep trong Java Thread dùng để đặt chế độ "ngủ" cho một luồng trong một khoảng thời gian nhất định. 

#### Tác Dụng:
> Tác dụng của phương thức sleep trong Java là cho phép một luồng tạm dừng hoạt động trong một khoảng thời gian nhất định. Điều này có thể sử dụng để tạo ra các hiệu ứng chậm trễ hoặc tạm dừng trong một chương trình.

#### Nó có nội dung như sau:
```java
public static void sleep(long millis) throws InterruptedException
```

Ví dụ:

```java
public class SleepExample extends Thread{
    public static void main(String[] args) {
        System.out.println("Starting the thread...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has been resumed...");
    }
}

//! Trong ví dụ trên, luồng hiện tại sẽ tạm dừng hoạt động trong 3 giây (3000 milliseconds) và sau đó tiếp tục hoạt động.
``` 

**Lưu ý**: Phương thức sleep có thể gây ra ngoại lệ InterruptedException nếu luồng bị ngắt trong khoảng thời gian chờ.

### Trong Java, có 2 phương thức chính của lớp Thread dùng để đặt chế độ "ngủ" cho một luồng:
```java
public static void sleep(long millis) throws InterruptedException
```
Phương thức này đặt chế độ "ngủ" cho luồng hiện tại trong một khoảng thời gian cho trước, được chỉ định bằng tham số millis, đơn vị tính là millisecond.

```java
public static void sleep(long millis, int nanos) throws InterruptedException
```
Phương thức này đặt chế độ "ngủ" cho luồng hiện tại trong một khoảng thời gian cho trước, được chỉ định bằng tham số millis và nanos, đơn vị tính là millisecond và nanosecond tương ứng.



