package src.game.GameSnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics extends JFrame implements ActionListener {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    static final int TICK_SIZE = 50;
    static final int BOARD_SIZE = (WIDTH * HEIGHT)/(TICK_SIZE * TICK_SIZE);


    int[] snakePosX = new int[BOARD_SIZE];
    int[] snakePosY = new int[BOARD_SIZE];
    int snakeLength;

    char direction = 'R';
    boolean isMoving = false;
    final Timer timer = new Timer(150, this);

    public Graphics() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.WHITE);
        this.setFocusable(true);

        start();
    }
    protected void start() {
        snakePosX = new int[BOARD_SIZE];
        snakePosY = new int[BOARD_SIZE];
        snakeLength = 5;
        direction = 'R';
        isMoving = true;
        timer.start();
    }
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponents(g);
        if (isMoving) {
            g.setColor();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
