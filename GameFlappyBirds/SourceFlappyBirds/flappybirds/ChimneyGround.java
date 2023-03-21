package GameFlappyBirds.SourceFlappyBirds.flappybirds;

import GameFlappyBirds.SourceFlappyBirds.gamesframework.QueueList;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ChimneyGround {
    private QueueList<Chimney> chimneys; // tạo danh sách hàng đội để lưu nhiều ống khói.
    private BufferedImage chimneyImage, chimneyImage2;
    public static int SIZE = 6;
    public Chimney getChimney(int i) {
        return chimneys.get(i);
    }

    public ChimneyGround() {

        try {
            // add hình cái ống khói.
            chimneyImage = ImageIO.read(new File("GameFlappyBirds/Image/chimney.png"));
            chimneyImage2 = ImageIO.read(new File("GameFlappyBirds/Image/chimney2.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        chimneys = new QueueList<Chimney>();

        Chimney cn;
        for(int i = 0; i < SIZE/2; i++) {
            // 830 + i * 300 : là khoản cách giữa các ống khói
            cn = new Chimney(830 + i * 300, 350, 74, 400);
            chimneys.push(cn);

            cn = new Chimney(830 + i * 300, -300, 74, 400);
            chimneys.push(cn);
        }
    }


    public void update() {
        for(int i = 0; i < SIZE; i++) {
            chimneys.get(i).update();
        }

        if (chimneys.get(0).getPosX() < -74) {
            Chimney cn;
            cn = chimneys.pop(); // xóa ống khói hiện tại
            cn.setPosX(chimneys.get(4).getPosX() + 300);
            chimneys.push(cn);

            cn = chimneys.pop();
            cn.setPosX(chimneys.get(4).getPosX());
            chimneys.push(cn);
        }

    }

    public void paint(Graphics2D g2) {
        for(int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                g2.drawImage(chimneyImage, (int)chimneys.get(i).getPosX(), (int)chimneys.get(i).getPosY(), null);
            } else {
                g2.drawImage(chimneyImage2, (int)chimneys.get(i).getPosX(), (int)chimneys.get(i).getPosY(), null);
            }

        }
    }


}
