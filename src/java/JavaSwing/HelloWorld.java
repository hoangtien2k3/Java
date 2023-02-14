package src.java.JavaSwing;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
    public HelloWorld() throws HeadlessException {
        setSize(400, 400);
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
