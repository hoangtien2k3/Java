package src.java.Swing.JavaSwing.JFrame;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Java_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame"); // khởi tạo một JFrame truyền vào constructor là "JFrame"

//        frame.setSize(400, 400); // set kích thước theo chiều rộng, chiều dài.
//        frame.setLocation(400, 400); // set kích thước theo tạo độ X, Y.

        Container container = frame.getContentPane();
        JButton button = new JButton("Close");
        container.add(button);

        frame.setBounds(500, 100, 400, 400);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // set kích thước tối đa
        frame.setLocationRelativeTo(null); // set kích thước để hiện thị frame chính giữa màn hình destop.



        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("JFrame has been made open first tims.");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("JFrame is closing.");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("JFrame is closed.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("JFrame is minimized.");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("JFrame is restored.");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("JFrame is activated.");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("JFrame is deactivated.");
            }
        });


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });


        frame.setVisible(true); // setVisible dùng để hiển thị frame đó ra màn hình
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); // EXIT_ON_CLOSE: Sau frame đóng thì chương trình sẽ tắt theo.

    }
}
