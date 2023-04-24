
## Object

Mặc định lớp Object là lớp cha của tất cả các lớp trong java. Nói cách khác nó là một lớp cáo nhất trong java.

![](https://viettuts.vn/images/java/lop-object-trong-java.jpg)

### Tại sao lại sử dụng Oject:
Sử dụng lớp Object là hữu ích nếu bạn muốn tham chiếu bất kỳ đối tượng nào mà bạn chưa biết kiểu dữ liệu của đối tượng đó. 
- Chú ý rằng biến tham chiếu của lớp cha có thể tham chiếu đến đối tượng của lớp con được gọi là [upcasting]().

| Phương thức                                                               | Mô tả                                                                                                                                                              |
|---------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public final Class getClass()                                             | trả về đối tượng lớp Class của đối tượng hiện tại. Từ lớp Class đó có thể lấy được các thông tin metadata của class hiện tại.                                      |
| public int hashCode()                                                     | trả về số hashcode cho đối tượng hiện tại.                                                                                                                         |
| public boolean equals(Object obj)                                         | so sánh đối tượng đã cho với đối tượng hiện tại.                                                                                                                   |
| protected Object clone() throws CloneNotSupportedException                | tạo và trả về bản sao chép (clone) của đối tượng hiện tại.                                                                                                         |
| public String toString()                                                  | trả về chuỗi ký tự đại diện của đối tượng hiện tại.                                                                                                                |
| public final void notify()                                                | đánh thức một luồng, đợi trình giám sát của đối tượng hiện tại.                                                                                                    |
| public final void notifyAll()                                             | đánh thức tất cả các luồng. đợi trình giám sát của đối tượng hiện tại.                                                                                             |
| public final void wait(long timeout)throws InterruptedException           | làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây cụ thể, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()).              |
| public final void wait(long timeout,int nanos)throws InterruptedException | làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây và nano giây cụ thể, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()). |
| public final void wait()throws InterruptedException                       | làm Thread hiện tại đợi, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()).                                                                |
| protected void finalize()throws Throwable                                 | Được gọi bởi Garbage Collector trước khi đối tượng bị dọn rác.                                                                                                     |





