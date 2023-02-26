package src.java.Swing;

import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {

    private Label label;
    private Button button;

    public AWTExample() {
        super("Chương trình AWT");
        setLayout(new FlowLayout());

        label = new Label("Chào mừng đến với Java AWT!");
        add(label);

        button = new Button("Nhấn vào đây");
        add(button);

        button.addActionListener(this);

        setSize(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Bạn đã nhấn vào nút!");
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
