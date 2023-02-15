
## JLabel trong Java Swing
Trong Java Swing, **JLabel** là một lớp được sử dụng để hiển thị một đoạn văn bản hoặc hình ảnh trên giao diện đồ họa. Đối tượng JLabel **không thể được chỉnh sửa hoặc nhập liệu** bởi người dùng, nó chỉ được sử dụng để hiển thị thông tin tĩnh.


### Cú pháp của lớp javax.swing.JLabel:
```java
public class JLabel extends JComponent
        implements SwingConstants, Accessible
```
    

Một số thuộc tính của JLabel bao gồm:
- [text](): Đây là văn bản hiển thị trên nhãn.
- [icon](): Đây là một hình ảnh hiển thị trên nhãn.
- [horizontalAlignment](): Đây là định dạng của văn bản trên nhãn, bao gồm giữa, trái hoặc phải.
- [verticalAlignment](): Đây là định dạng của văn bản dọc trên nhãn, bao gồm giữa, trên hoặc dưới.


### Constructor của lớp JLabel trong Java Swing
1. JLabel(): Tạo một instance của JLabel, không có hình ảnh, và với một chuỗi trống cho title.

2. JLabel(Icon image): Tạo một instance của JLabel với hình ảnh đã cho.

3. JLabel(Icon image, int horizontalAlignment): Tạo một instance của JLabel với hình ảnh và căn chỉnh ngang đã cho.

4. JLabel(String text): Tạo một instance của JLabel với text đã cho.

5. JLabel(String text, Icon icon, int horizontalAlignment): Tạo một instance của JLabel với text, hình ảnh, và căn chỉnh ngang đã cho.

7. JLabel(String text, int horizontalAlignment): Tạo một instance của JLabel với text và căn chỉnh ngang đã cho.





### Một số phương thức thường được sử dụng của lớp JLabel:

1.	void setDisabledIcon(Icon disabledIcon)
Thiết lập icon để được hiển thị nếu JLabel này là "disabled" (JLabel.setEnabled(false))

2.	void setDisplayedMnemonic(char aChar)
Xác định displayedMnemonic như là một giá trị char

3.	void setDisplayedMnemonic(int key)
Xác định keycode mà chỉ dẫn một mnemonic key

4.	void setDisplayedMnemonicIndex(int index)
Cung cấp một hint cho L&F, từ đó ký tự trong text nên được trang trí để biểu diễn mnemonic

5.	void setHorizontalAlignment(int alignment)
Thiết lập sự căn chỉnh nội dung của label theo trục X

6.	void setHorizontalTextPosition(int textPosition)
Thiết lập vị trí theo chiều ngang của phần text của label, cân xứng với hình ảnh của nó

7.	void setIcon(Icon icon)
Định nghĩa icon mà thành phần này sẽ hiển thị

8.	void setIconTextGap(int iconTextGap)
Nếu cả hai thuộc tính icon và text được thiết lập, thuộc tính này xác định khoảng trống giữa chúng

9.	void setLabelFor(Component c)
Thiết lập thành phần đang gán nhãn cho

10.	void setText(String text)
Định nghĩa trường text dòng đơn mà thành phần này sẽ hiển thị

11.	void setUI(LabelUI ui)
Thiết lập đối tượng L&F mà biểu diễn thành phần này

12.	void setVerticalAlignment(int alignment)
Thiết lập sự căn chỉnh nội dung của label theo trục Y

13.	void setVerticalTextPosition(int textPosition)
Thiết lập vị trí theo chiều dọc của phần text của label, cân xứng với hình ảnh của nó

14.	void updateUI()
Phục hồi thuộc tính UI về một giá trị từ L&F hiện tại



```java
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyLabelExample {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Label Example");
      JLabel label = new JLabel("Hello World");
      label.setBounds(100, 100, 200, 30);
      frame.add(label);
      frame.setSize(400, 500);
      frame.setLayout(null);
      frame.setVisible(true);
   }
}
```







