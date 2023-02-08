
## Phương thức sleep trong java


Phương thức sleep trong Java Thread dùng để đặt chế độ "ngủ" cho một luồng trong một khoảng thời gian nhất định. 

#### Nó có nội dung như sau:
```java
public static void sleep(long millis) throws InterruptedException
```

Ví dụ:

```java
try {
    Thread.sleep(1000); // sleep for 1000 milliseconds (1 second)
} catch (InterruptedException e) {
    // handle exception
}
```

**Lưu ý**: Phương thức sleep có thể gây ra ngoại lệ InterruptedException nếu luồng bị ngắt trong khoảng thời gian chờ.





