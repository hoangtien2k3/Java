
# Create Thread Java(tạo thread trong java)

### Làm thế nào để tạo thread trong java
- Có hai cách để tạo ra một thread:
  - Bởi extends lớp Thread
  - Bởi implements Runnable interface.


### Lớp Thread
Lớp Thread cung cấp các constructor và phương thức để tạo và thực hiện các hoạt động trên một thread. Lớp Thread extends từ lớp Object và implements Runnable interface.

##### Các constructor thường được sử dụng của lớp Thread

```java
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r,String name)
```

#### Các phương thức thường được sử dụng của lớp Thread:
> 1. public void run(): Được sử dụng để thực hiện hành động cho một thread..
> 2. public void start(): Bắt đầu thực hiện thread. JVM gọi phương thức run() trên thread.
> 3. public void sleep(long miliseconds): Làm cho thread hiện tại tạm ngừng thực thi cho số mili giây quy định.
> 4. public void join(): Đợi cho một thread chết.
> 5. public void join(long miliseconds): Đợi cho một thread chết với các mili giây quy định.
> 6. public int getPriority(): Trả về mức độ ưu tiên của thread.
> 7. public int setPriority(int priority): Thay đổi mức độ ưu tiên của thread.
> 8. public String getName(): Trả về tên của thread.
> 9. public void setName(String name): Thay đổi tên của thread.
> 10. public Thread currentThread(): Trả về tham chiếu của thread đang được thi hành.
> 11. public int getId(): Trả về id của thread.
> 12. public Thread.State getState(): Trả về trạng thái của thread.
> 13. public boolean isAlive(): Kiểm tra nếu thread còn sống.
> 14. public void yield(): Làm cho các đối tượng thread đang thực thi để tạm thời tạm dừng và cho phép các thread khác để thực thi.
> 15. public void suspend(): Được sử dụng để hoãn lại các thread (không dùng nữa).
> 16. public void resume(): Được sử dụng để tiếp tục các thread đang bị hoãn (không dùng nữa).
> 17. public void stop(): Được sử dụng để dừng thread (không dùng nữa).
> 18. public boolean isDaemon(): Kiểm tra nếu thread là một luồng hiểm.
> 19. public void setDaemon(boolean b): Đánh dấu thread là luồng hiểm hoặc luồng người dùng.
> 20. public void interrupt(): Ngắt thread.
> 21. public boolean isInterrupted(): Kiểm tra nếu thread đã bị ngắt.
> 22. public static boolean interrupted(): Kiểm tra nếu thread hiện tại đã bị ngắt.


### Runnable interface
Giao tiếp Runnable nên được cài đặt bởi bất kỳ lớp nào mà thể hiển của lớp đó dự định sẽ được thực thi bởi thread. Giao tiếp Runnable chỉ có một phương thức run().

- public void run(): Được sử dụng để thực hiện hành động cho một thread.

### Start một thread
Phương thức start() của lớp Thread được sử dụng để bắt đầu một thread mới được tạo. Nó thực hiện các nhiệm vụ sau:

- Start một new thread(với new callstack). 
- Thread chuyển từ trạng thái New sang trạng thái Runnable.
- Khi thread được một cơ hội để thực thi, phương thức run() của nó sẽ chạy.


















