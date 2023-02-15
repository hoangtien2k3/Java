
## JFrame trong Java Swing
JFrame là một container (Nơi chứa và sắp xếp các component khác của Java Swing, có thể là các container khác) trong ứng dụng Java Swing, nó được dùng để chứa và sắp xếp các phần con như Button, Label, TextField, etc. 

### Tạo một JFrame:
> JFrame  frame  = new JFrame("Swing");

Mặc định khi một JFrame được khởi tạo xong nó sẽ ở trạng thái ẩn, tất là người dùng sẽ không thấy được. \

- Nếu muốn hiển thị JFrame này đến người dùng chúng ta cần gọi đến setVisible(boolean visible) với giá trị truyền vào:
  - [True]() – JFrame sẽ hiện thị ra giao diện.
  - [False]() – JFrame sẽ bị ẩn đi.


###  Xử lý khi JFrame bị đóng với Phương thức: 'setDefaultCloseOperation ()'
Java Swing cung cấp 4 hằng số tương ứng với 4 loại hành động sau khi một JFrame bị đóng.
- [DO_NOTHING_ON_CLOSE](): Không làm thêm bất cứ điều gì khi JFrame bị đóng
- [HIDE_ON_CLOSE](): JFrame sẽ bị ẩn đi khi người dùng đóng nó lại. Chương trình vẫn sẽ hoạt
- [DISPOSE_ON_CLOSE](): Sau khi bị đóng lại, nó đồng thời sẽ bị dọn dẹp rác, các tài nguyên được JFrame này sử dụng sẽ bị thu hồi nhường chỗ cho những nơi khác sử dụng.
- [EXIT_ON_CLOSE](): Sau khi JFrame bị đóng, chương trình cũng sẽ tắt theo.


### Chiều cao, rộng và vị trí của JFrame trên màn hình Desktop:
Mặc định khi JFrame được khởi tạo thì vị trí xuất hiện của nó trên mành hình Desktop nằm ở phía trên bên trái cùng của màn hình. Kích thước tuỳ thuộc vào các component chứa trong nó.

Để thay đổi kích thước và vị trí mặc định của JFrame, chúng ta có thể sử dụng:
  - [setSize(width, height)](): Chỉ định chiều rộng vào chiều cao của JFrame
  - [setLocation(int x, int y)](): Chỉ định tọa độ của JFrame trên màn hình theo 2 trục X, Y.
  - [setBounds(int x, int y, int width, int height)](): Cách sử dụng nhanh, gộp 2 hàm ở trên lại thành 1.

> EX: frame.setBounds(500, 100, 400, 400);


### Cài đặt LayoutManager cho JFrame:
JFrame là một container dùng để chứa và sắp xếp các component con bên trong chúng, điều này hiển nhiên chúng ta có thể gán cho nó một Layout giúp phân bổ các thành con hiệu quả hơn.



### Cấu hình kích thước của JFrame sử dụng method 'setExtendedState()'
Chúng ta muốn kích thước của JFrame lớn bằng màn hình desktop, hay chiều rộng bằng với chiều rộng của màn hình Desktop thì chúng ta sẽ làm 

- [NORMAL](): – Hiển thị kích thước thông thường
- [ICONIFIED](): – Hiển thị kích thước thu nhỏ
- [MAXIMIZED_HORIZ](): – Hiển thi với kích chiều rộng đạt kích thước tối đa
- [MAXIMIZED_VERT](): – Hiển thi với kích chiều cao đạt kích thước tối đa
- [MAXIMIZED_BOTH](): – Hiển thị với kích thước chiều cao và chiều rộng đạt kích thước tối đa



### Canh JFrame ở giữa màn hình sử dụng 'setLocationRelativeTo()'
> frame.setLocationRelativeTo(null); // set frame hiển thị chính giữa màn hình destop.



### Xử lý sự kiện trong JFrame:
Dưới đây là cách tạo và xử lý một số sự kiện cơ bản trong JFrame chẳng hạn như:
- windowOpened – Lúc JFrame mới mở lên
- windowClosed – JFrame bị đóng lại
- vv.v

















