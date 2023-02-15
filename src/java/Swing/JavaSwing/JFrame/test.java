package src.java.Swing.JavaSwing.JFrame;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class test {
    public static void main(String[] args)  {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("JFrame has  been  made visible first  time");
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
                System.out.println("JFrame is  minimized.");
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
        // Use the WindowAdapter class to intercept only the window closing event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("JFrame is closing.");
            }
        });
        frame.setVisible(true);
    }
}
