package src.java.Swing;

import java.awt.*;
import java.awt.event.*;

public class AWTExample2 extends Frame implements ItemListener {
    Checkbox checkbox1, checkbox2, checkbox3;
    CheckboxGroup checkboxGroup;
    List list;
    Choice choice;

    public AWTExample2() {
        setLayout(new FlowLayout());

        // Tạo CheckboxGroup
        checkboxGroup = new CheckboxGroup();
        checkbox1 = new Checkbox("Tùy chọn 1", checkboxGroup, false);
        checkbox2 = new Checkbox("Tùy chọn 2", checkboxGroup, false);
        checkbox3 = new Checkbox("Tùy chọn 3", checkboxGroup, false);
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);

        // Tạo List
        list = new List(3, true);
        list.add("Mục 1");
        list.add("Mục 2");
        list.add("Mục 3");
        add(list);

        // Tạo Choice
        choice = new Choice();
        choice.add("Tùy chọn 1");
        choice.add("Tùy chọn 2");
        choice.add("Tùy chọn 3");
        add(choice);

        // Đăng ký bộ lắng nghe ItemListener cho các thành phần AWT
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);
        list.addItemListener(this);
        choice.addItemListener(this);

        setTitle("AWT Example 2");
        setSize(400, 300);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkbox1) {
            if (checkbox1.getState()) {
                System.out.println("Tùy chọn 1 được chọn");
            }
        } else if (e.getSource() == checkbox2) {
            if (checkbox2.getState()) {
                System.out.println("Tùy chọn 2 được chọn");
            }
        } else if (e.getSource() == checkbox3) {
            if (checkbox3.getState()) {
                System.out.println("Tùy chọn 3 được chọn");
            }
        } else if (e.getSource() == list) {
            int index = list.getSelectedIndex();
            if (index != -1) {
                System.out.println("Mục " + (index + 1) + " được chọn trong danh sách");
            }
        } else if (e.getSource() == choice) {
            int index = choice.getSelectedIndex();
            if (index != -1) {
                System.out.println("Tùy chọn " + (index + 1) + " được chọn trong Choice");
            }
        }
    }

    public static void main(String[] args) {
        AWTExample2 example = new AWTExample2();
    }
}