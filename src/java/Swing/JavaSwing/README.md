## Java Swing

Java Swing là một phần của Java Foundation Classes (JFC) được sử dụng để tạo các ứng dụng window-based. Nó được xây dựng trên API AWT (Abstract Windowing Toolkit) và được viết hoàn toàn bằng Java.

### Sự khác nhau giữa AWT và Swing:
| STT | **Java AWT**                                                                                                                                                                | **Java Swing**                                                                                                        |
|-----|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| 1.  | Các thành phần AWT là [**phụ thuộc nền tảng**]().                                                                                                                           | Các thành phần Java swing là [**độc lập nền tảng**]().                                                                |
| 2.  | Các thành phần AWT là [**nặng**]().                                                                                                                                         | Các thành phần Swing là [**nhẹ**]().                                                                                  |
| 3.  | AWT không hỗ trợ [**plugin**]().                                                                                                                                            | Swing có hỗ trợ [**plugin**]().                                                                                       |
| 4.  | AWT cung cấp [**ít thành phần hơn**]() Swing.                                                                                                                               | Swing cung cấp [**nhiều thành phần mạnh mẽ hơn AWT**]() như tables, lists, scrollpanes, colorchooser, tabbedpane, vv. |
| 5.  | AWT [**không tuân theo MVC**]()(Model View Controller) trong đó model biểu diễn data, view biểu diễn hiển thị và controller biểu diễn các action để kết nối model với view. | Swing [**tuân theo mô hình MVC**]().                                                                                  |




### Phân cấp các lớp Java Swing:
![Screenshot 2023-02-15 111429](https://user-images.githubusercontent.com/122768076/218928257-69c525b4-cf39-4057-93e9-c549d0d65048.png)




### Các phương thức thường dùng của lớp Component:
| Phương thức                                | Mô tả                                                                      |
|--------------------------------------------|----------------------------------------------------------------------------|
| public void add(Component c)               | thêm một thành phần vào thành phần khác.                                   |
| public void setSize(int width, int height) | thiết lập kích thước của thành phần.                                       |
| public void setLayout(LayoutManager m)     | thiết lập trình quản lý bố cục (layout) cho thành phần.                    |
| public void setVisible(boolean b)          | thiết lập khả năng hiển thị của thành phần. Nó theo mặc định là false (ẩn) |


## Java Swing:
Có hai cách để tạo khung (Frame):
- Bằng cách tạo đối tượng của lớp JFrame.
- Bằng cách kế thừa lớp JFrame.

Chúng ta có thể viết code của Swing bên trong hàm main(), constructor hoặc bất kỳ phương thức nào khác.

```java
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();// tạo thể hiện của JFrame
 
        JButton b = new JButton("click");// tạo thể hiện của JButton
        b.setBounds(130, 50, 100, 40);// trục x , y , width, height
 
        f.setTitle("Ví dụ Java Swing");
        f.add(b);// thêm button vào JFrame
 
        f.setSize(400, 200);// thiết lập kích thước cho của sổ
        f.setLayout(null);// không sử dụng trình quản lý bố cục
        f.setVisible(true);// hiển thị cửa sổ
    }
}
```





