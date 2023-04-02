
## Tổng quan về JDBC

### JDBC là gì?
- JDBC, là viết tắt của Java Database Connectivity, là một Java API chuẩn để kết nối giữa ngôn ngữ lập trình Java và các cơ sở dữ liệu đa dạng.
-  JDBC, bạn có thể thực hiện nhiều tác vụ đa dạng khi làm việc với cơ sở dữ liệu như tạo, xóa cơ sở dữ liệu; tạo và thực thi các lệnh SQL hoặc MySQL.


### Tại sao sử dụng JDBC?
Tại vì (ODBC driver được viết bằng ngôn ngữ C (là phụ thuộc nền tảng và không an toàn).)
- Java đã định nghĩa riêng API (là JDBC API) để thực hiện các thao tác khi làm việc với cơ sở dữ liệu
- JDBC driver này được viết bằng ngôn ngữ Java để cung cấp các lợi thế rõ rệt của ngôn ngữ này.



### API là gì?
- API, là viết tắt của Application Programming Interface, là một tài liệu gồm sự mô tả về tất cả các đặc điểm của một sản phẩm hoặc phần mềm.
- Nó biểu diễn các Class và Interface mà các chương trình phần mềm có thể theo sau để giao tiếp với nhau. 


### JDBC API cung cấp các Class và Interface sau:

- [DriverManager]() : Lớp này quản lý các Database Driver. 
- [Driver]() :  Interface này xử lý các kết nối với Database Server. 
- [Connection]() : Đối tượng Connection biểu diễn ngữ cảnh giao tiếp. Interface này chứa nhiều phương thức đa dạng để tạo kết nối với một Database.
- [Statement]() : đối tượng được tạo từ Interface này để đệ trình các lệnh SQL tới Database.
- [ResultSet]() : Các đối tượng này giữ dữ liệu được thu nhận từ một Database sau khi bạn thực thi một truy vấn SQL.
- [SQLException]() : Lớp này xử lý bất cứ lỗi nào xuất hiện trong khi làm việc với Database.




### JDBC Driver chuyển đổi kiểu dữ liệu của Java thành kiểu dữ liệu của JDBC tương ứng trước khi gửi giá trị dữ liệu tới Database.

| SQL         | 	JDBC/Java            | 	setXXX                      | 	updateXXX      |
|-------------|-----------------------|------------------------------|-------------------|
| VARCHAR     | 	java.lang.String     | 	setString                   | 	updateString     |
| CHAR        | 	java.lang.String     | 	setString	updateString      
| LONGVARCHAR | 	java.lang.String     | 	setString	                  | updateString      |
| BIT         | 	boolean	setBoolean   | 	updateBoolean               |
| NUMERIC     | 	java.math.BigDecimal | 	setBigDecimal               | 	updateBigDecimal |
| TINYINT     | 	byte                 | 	setByte	updateByte          |
| SMALLINT    | 	short                | 	setShort                    | 	updateShort      |
| INTEGER     | 	int	setInt           | 	updateInt                   |
| BIGINT      | 	long	                | setLong	                     | updateLong        |
| REAL        | 	float                | 	setFloat                    | 	updateFloat      |
| FLOAT       | 	float	               | setFloat                     | 	updateFloat      |
| DOUBLE      | double                | 	setDouble	                  | updateDouble      |
| VARBINARY   | 	byte[ ]	             | setBytes                     | 	updateBytes      |
| BINARY      | 	byte[ ]	             | setBytes                     | 	updateBytes      |
| DATE        | 	java.sql.Date        | 	setDate                     | 	updateDate       |
| TIME        | 	java.sql.Time	       | setTime                      | 	updateTime       |
| TIMESTAMP   | 	java.sql.Timestamp   | 	setTimestamp	               | updateTimestamp   |
| CLOB        | 	java.sql.Clob	       | setClob	updateClob           |
| BLOB        | 	java.sql.Blob        | 	setBlob	updateBlob          |
| ARRAY       | 	java.sql.Array	      | setARRAY	                    | updateARRAY       |
| REF         | 	java.sql.Ref	        | SetRef	                      | updateRef         |
| STRUCT      | 	java.sql.Struct      | 	SetStruct                   | 	updateStruct     |


















