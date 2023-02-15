package src.java.Swing.JavaSwing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Java_JLabel {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public Java_JLabel() {
        prepareGUI();
    }

    public static void main(String[] args) {
        new Java_JLabel().showLabelDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("JLabel in Java Swing");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0); // thoát khỏi chương trình.
            }
        });
        headerLabel = new JLabel("Hi", JLabel.CENTER);
        statusLabel = new JLabel("hi", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showLabelDemo() {
        headerLabel.setText("action: JLabel");
        JLabel label = new JLabel("", JLabel.CENTER);
        label.setText("Hoàng Anh Tiến Đẹp Zai Oke!!");
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        controlPanel.add(label);
        mainFrame.setVisible(true);
    }
}
