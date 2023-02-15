package src.java.Swing.JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 extends JFrame {// kế thừa lớp JFrame

    public Swing2() {
        JButton b = new JButton("click");// tạo button
        b.setBounds(130, 50, 100, 40);

        add(b);// thêm button vào JFrame
        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing2();
    }
}
