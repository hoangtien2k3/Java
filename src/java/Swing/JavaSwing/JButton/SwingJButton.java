package src.java.Swing.JavaSwing.JButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJButton {
    SwingJButton() {
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
        new SwingJButton();
    }
}