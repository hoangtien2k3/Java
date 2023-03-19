
## Java Virtual Machine (JVM)
Virtual Machine (hay còn gọi là máy ảo) là một instance của máy vật lý, phân tích và thực thi bytecode.


### JVM làm việc như thế nào?
Theo mô hình kiến trúc trên, JVM được chia thành 3 hệ thống con chính :

- Class Loader Subsystem
- Runtime Data Area
- Execution Engine

### 1. Class Loader Subsystem
1.1 Loading

- Boot Strap ClassLoader : chịu trách nhiệm load các class từ classpath, đó là các file .jar . Ưu tiên cao nhất sẽ được trao cho trình nạp class này.
- Extension ClassLoader : Chịu trách nhiệm load các class nằm trong thư mục jre\lib
- Application ClassLoader : Chịu trách nhiệm load các class từ được cấu hình ở các đường dẫn (path) được đề cập trong biến môi trường.

1.2 Linking
- Verify : Bytecode verifier (trình xác minh bytecode) sẽ kiểm tra xem byte code có được tạo ra phù hợp hay không. Nếu xác minh là không thành công, sẽ thông báo lỗi verify.
- Prepare : Đối với tất cả các static variables memory sẽ được phân bổ và gnas với các giá trị mặc định.
- Resolve : All symbolic memory references are replaced with the original references from Method Area.

...


