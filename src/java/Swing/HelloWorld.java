package src.java.Swing;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class HelloWorld implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public HelloWorld() {
        frame = new JFrame("Vui nhộn với Swing!");
        panel = new JPanel();
        button = new JButton("Thay đổi màu nền");

        button.addActionListener(this);

        panel.add(button);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color randomColor = new Color((int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255));
        panel.setBackground(randomColor);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}
