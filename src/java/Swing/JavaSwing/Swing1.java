package src.java.Swing.JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
    JFrame f;

    public Swing1() {
        f = new JFrame();// tạo thể hiện của JFrame

        JButton b = new JButton("click");// tạo thể hiện của JButton
        b.setBounds(130, 50, 100, 40);

        f.add(b);// thêm button vào JFrame

        f.setSize(400, 200);// thiết lập kích thước cho của sổ
        f.setLayout(null);// không sử dụng trình quản lý bố cục
        f.setVisible(true);// hiển thị cửa sổ
    }

    public static void main(String[] args) {
        new Swing1();
    }
}