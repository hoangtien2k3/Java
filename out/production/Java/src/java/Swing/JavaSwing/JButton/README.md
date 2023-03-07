
## Lớp JButton trong Java Swing

Trong Java, JButton là một lớp (class) được sử dụng để tạo các nút bấm trên giao diện đồ họa. Nút bấm này có thể được sử dụng để thực hiện các hành động cần thiết khi người dùng nhấn vào nó.

### [**Cú pháp của lớp javax.swing.JButton**]()
```java
public class JButton extends AbstractButton implements Accessible
```

### Lớp này kế thừa các phương thức từ các lớp sau:
- javax.swing.AbstractButton
- javax.swing.JComponent
- java.awt.Container
- java.awt.Component
- java.lang.Object


### [Lớp JButton có các constructor sau]()
1. JButton(): Tạo một button mà không thiết lập text hoặc icon.
2. JButton(Action a): Tạo một button tại đây các thuộc tính được nhận từ Action đã cung cấp.
3. JButton(Icon icon): Tạo một button với một icon.
4. JButton(String text): Tạo một button với text.
5. JButton(String text, Icon icon): Tạo một button với text ban đầu và một icon.


### [Phương thức phổ biến của lớp JButton]()
1. [**void removeNotify()**](): Ghi đè JComponent.removeNotify để kiểm tra xem button này hiện tại được thiết lập như là button mặc định trên RootPane hay không, và nếu có, thiết lập button mặc định của RootPane về null để bảo đảm rằng Rootpane không giữ một tham chiếu button không hợp lệ.
2. [**void setDefaultCapable(boolean defaultCapable)**](): Thiết lập thuộc tính defaultCapable, mà quyết định xem có hay không button này có thể được tạo là button mặc định cho Root Pane của nó
3. [**void updateUI()**](): Phục hồi thuộc tính UI về một giá trị từ L&F hiện tại


### [Phương thức phổ biến của lớp AbstractButton]()
1. [public void setText(String s)](): được sử dụng để thiết lập text đã cho trên button.
2. [public String getText()](): được sử dụng để trả về text của button.
3. [public void setEnabled(boolean b)](): được sử dụng để kích hoạt hoặc vô hiệu hóa button.
4. [public void setIcon(Icon b)](): được sử dụng để thiết lập Icon đã cho trên button.
5. [public Icon getIcon()](): được sử dụng để lấy Icon của button.
6. [public void setMnemonic(int a)](): được sử dụng để thiết lập thuộc tính mnemonic trên button.
7. [public void addActionListener(ActionListener a)](): được sử dụng để thêm action listener tới đối tượng này.




```java
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJButtonExam1 {
    SwingJButtonExam1() {
        JFrame f = new JFrame();

        JButton b = new JButton(new ImageIcon("b.jpg"));
        b.setBounds(130, 100, 100, 40);

        f.add(b);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingJButtonExam1();
    }
}
```

















