
## JDBC Driver là gì?
Có 4 kiểu JDBC Driver:
1. JDBC-ODBC bridge driver
2. Native-API driver (partially java driver)
3. Network Protocol driver (fully java driver)
4. Thin driver (fully java driver)


## 1.  JDBC-ODBC bridge driver:
JDBC-ODBC bridge driver: Đây là một driver cầu nối giữa JDBC và ODBC (Open Database Connectivity) driver của hệ thống Windows. Driver này chuyển đổi các lệnh JDBC thành lệnh ODBC để truy cập cơ sở dữ liệu. Chức năng chính của nó là kết nối các ứng dụng Java với các cơ sở dữ liệu mà chỉ hỗ trợ ODBC.
![](https://static.javatpoint.com/images/type11.JPG)


## 2. Native-API driver:
Native-API driver (partially java driver): Driver này sử dụng các API riêng của các hệ thống quản lý cơ sở dữ liệu như Microsoft SQL Server, Oracle hoặc MySQL để truy cập cơ sở dữ liệu. Driver này sử dụng phần mềm cụ thể của hệ thống để tương tác với cơ sở dữ liệu, nên yêu cầu cài đặt các file thư viện trên hệ thống. Nó được gọi là partially java driver vì phần lớn mã lệnh của driver được viết bằng ngôn ngữ máy chủ, trong khi chỉ một số phần nhỏ được viết bằng Java. Driver này nhanh và hiệu quả hơn JDBC-ODBC bridge driver, tuy nhiên nó cũng đòi hỏi sự chú ý đối với việc cài đặt và cấu hình.
![](https://static.javatpoint.com/images/type12.JPG)

## 3. Network Protocol driver:
Network Protocol driver (fully java driver): Driver này sử dụng một giao thức mạng cụ thể để truy cập cơ sở dữ liệu, chẳng hạn như TCP/IP hoặc NetBEUI. Driver này được viết hoàn toàn bằng Java, vì vậy nó không yêu cầu bất kỳ phần mềm ngoài nào để được cài đặt. Nó cung cấp tính linh hoạt và hiệu suất tốt, tuy nhiên, điều này đòi hỏi phải cài đặt driver cụ thể cho mỗi DBMS.
![](https://static.javatpoint.com/images/type13.JPG)

## 4. Thin driver:
Thin driver (fully java driver): Đây là kiểu driver hoàn toàn bằng Java, nó sử dụng các giao thức mạng để truy cập cơ sở dữ liệu, giống như Network Protocol driver.
![](https://static.javatpoint.com/images/type14.JPG)







