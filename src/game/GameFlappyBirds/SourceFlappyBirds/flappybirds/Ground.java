package src.game.GameFlappyBirds.SourceFlappyBirds.flappybirds;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ground {
    private BufferedImage groundImage;
    private int x1, y1, x2, y2;

    public Ground() throws IOException {
        try {
            groundImage = ImageIO.read(new File("src/game/GameFlappyBirds/Image/ground.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        x1 = 0;
        y1 = 500;
        x2 = x1 + 830; // 830 là độ dài của mặt đất ( mục đích ở đây là nối các mặt đất lại với nhau cho nó dài)
        y2 = 500;
    }

    public void Update() {
        x1 -= 2;
        x2 -= 2;

        if (x2 < 0)
            x1 = x2 + 830;
        if (x1 < 0)
            x2 = x1 + 830;
    }

    public void Paint(Graphics2D g2) {
        g2.drawImage(groundImage, x1, y1, null);
        g2.drawImage(groundImage, x2, y2, null);
    }

    public int getYGround() {
        return y1;
    }
}