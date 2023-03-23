
## Thread và Process:


### Lưu ý, có 2 loại thread là:
#### + CPU thread: 
- đại diện cho nhân của CPU core, processor.
- Ví dụ như chúng ta hay nghe đến Intel Core i5 4 cores 4 threads. Có thể coi đó là hardware thread để phân biệt với OS thread.


#### + OS thread:
- là thread của hệ điều hành, có thể gọi là software thread để phân biệt với CPU thread.
- Java thread tương ứng với một OS thread, tuy nhiên cần lưu ý rằng về bản chất nó là 2 thứ khác nhau.


### 1) Process:
- Kết luận đầu tiên: process là một chương trình phần mềm đang được thực thi trên máy tính, có rất nhiều process được khởi tạo và chạy đồng thời.

> Bên trong process bao gồm:
> - Instruction (công thức chế biến, các chỉ dẫn, hay nói cách khác là code).
> - Data (nguyên liệu của món salad).

```readme
Vậy, process có các tính chất:

Bao gồm thông tin của instruction, data và state.
Các process chạy độc lập với nhau trên vùng nhớ riêng biệt, không trực tiếp truy cập được dữ liệu của nhau. Không trực tiếp được nhưng có thể gián tiếp 😅.
```



### 2) Thread:
Ngoài thông tin của instruction, data và state, process còn bao gồm một hoặc nhiều thành phần nhỏ hơn được gọi là thread.

- Thead nằm trong process. 
- Process bao gồm rất nhiều thread trong đó và thread sẽ trực tiếp thực thi các nhiệm vụ, chỉ dẫn (series of instruction).


Tổng kết lại, thread có các tính chất:
```devicespec
- Thread nằm trong process, là tập con của process. Trong 1 process có thể có một hoặc nhiều thread.
- Thread, là đơn vị cơ bản để hệ điều hành quản lý và thực hiện.
- Tất cả các thread trong cùng một process sẽ chia sẻ chung vùng nhớ với nhau vì vậy việc giao tiếp giữa các thread khá đơn giản và dễ dàng hơn so với giao tiếp giữa các process.
- Việc tạo mới/hủy thread đơn giản và tốn ít công hơn so với việc tạo mới/hủy một process.
```



















