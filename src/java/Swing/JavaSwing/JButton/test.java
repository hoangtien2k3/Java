package src.java.Swing.JavaSwing.JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class JButtonExample extends JFrame {
    private JLabel lb;
    public JButtonExample() {
        // create JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(2, 1, 5, 5));
        // create JLabel
        lb = new JLabel("Label Title");
        lb.setHorizontalAlignment(JLabel.CENTER);
        add(lb);
        // Tạo Button
        JButton btn = new JButton("Nhấn vào đây");
        // Lắng nghe sự kiện Click và xử lý
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                changeTextJLabel();
            }
        });
        add(btn);
        // display JFrame
        setLocationRelativeTo(null);
        setVisible(true);
    }
    // change text of lb
    private void changeTextJLabel() {
        lb.setText("Bạn đã nhấp vào Button");
    }
    public static void main(String[] args) {
        new JButtonExample();
    }
}