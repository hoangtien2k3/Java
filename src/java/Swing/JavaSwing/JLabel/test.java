package src.java.Swing.JavaSwing.JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setBounds(500, 100, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField nameTextField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setDisplayedMnemonic('N');
        nameLabel.setLabelFor(nameTextField);

        nameLabel.setBounds(500, 100, 400, 400);

        frame.add(nameLabel, BorderLayout.WEST);
        frame.add(nameTextField, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

    }
}
