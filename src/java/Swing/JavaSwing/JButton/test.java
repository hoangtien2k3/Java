package src.java.Swing.JavaSwing.JButton;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        JButton button = new JButton("Click");
        button.setBounds(100, 100, 95, 30);
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);




    }
}
