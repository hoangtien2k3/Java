package src.java.InnerClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test_Anonymous_inner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Inner Class Example");
        JButton button = new JButton("Clicked");

        // Anonymous inner class to handle button click event
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hoàng Anh Tiến Thật Đẹp Trai!!!");
            }
        });

        frame.add(button);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
