package src.game.GameFlappyBirds.SourceFlappyBirds.flappybirds;

import src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework.QueueList;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ChimneyGround {
    private QueueList<Chimney> chimneys; // tạo danh sách hàng đội để lưu nhiều ống khói.
    private BufferedImage chimneyImage, chimneyImage2, chimneyImage3;
    public static int SIZE = 6;

    // xét độ dài cột ống khói bên trên.
    private int topChimneyY = -350;
    // xét độ dài cột ống khói bên dưới.
    private int bottomChimneyY = 180;

    public Chimney getChimney(int i) {
        return chimneys.get(i);
    }

    public int getRandomY() {
        Random random = new Random();
        int a;
        a = random.nextInt(10);
        // a là cố định, còn cái 40 là số mình có thể thay đổi để cho thay đổi độ cao cột ngẫu nhiên
        return a * 35;
    }

    public ChimneyGround() {
        try {
            // add hình cái ống khói.
            chimneyImage = ImageIO.read(new File("src/game/GameFlappyBirds/Image/chimney.png"));
            chimneyImage2 = ImageIO.read(new File("src/game/GameFlappyBirds/Image/chimney2.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        chimneys = new QueueList<Chimney>();
        Chimney cn;
        for(int i = 0; i < SIZE/2; i++) {
            int randomY = getRandomY();
            // tạo ống khói
            cn = new Chimney(830 + i * 300, bottomChimneyY + randomY, 74, 400);
            chimneys.push(cn);
            cn = new Chimney(830 + i * 300, topChimneyY + randomY, 74, 400);
            chimneys.push(cn);
        }
    }

    public void resertChimneys() {
        chimneys = new QueueList<Chimney>();
        Chimney cn;
        for(int i = 0; i < SIZE/2; i++) {
            int randomY = getRandomY();
            // tạo ống khói
            cn = new Chimney(830 + i * 300, bottomChimneyY + randomY, 74, 400);
            chimneys.push(cn);
            cn = new Chimney(830 + i * 300, topChimneyY + randomY, 74, 400);
            chimneys.push(cn);
        }
    }

    public void update() {
        for(int i = 0; i < SIZE; i++) {
            chimneys.get(i).update();
        }
        if (chimneys.get(0).getPosX() < -74) {
            int randomY = getRandomY();
            Chimney cn;
            cn = chimneys.pop(); // xóa ống khói hiện tại
            cn.setPosX(chimneys.get(4).getPosX() + 300);
            cn.setPosY(bottomChimneyY + randomY);
            cn.setIsBehindBird(false);
            chimneys.push(cn);

            cn = chimneys.pop();
            cn.setPosX(chimneys.get(4).getPosX());
            cn.setPosY(topChimneyY + randomY);
            cn.setIsBehindBird(false);
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