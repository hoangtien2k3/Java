package src.game.GameFlappyBirds.SourceFlappyBirds.flappybirds;

import src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework.Objects;

import java.awt.*;

public class Chimney extends Objects {
    private Rectangle rectangle;
    private boolean isBehindBird = false;

    public Chimney(int x, int y, int w, int h) {
        super(x, y, w, h);
        rectangle = new Rectangle(x, y, w, h);
    }

    public void update() {
        // có nghĩa là tốc độ di chuyển của cái ống khói nó sẽ bằng với tốc độ di chuyển của mặt đất.
        setPosX(getPosX() - 2);
        rectangle.setLocation((int)this.getPosX(), (int)this.getPosY());
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setIsBehindBird(boolean check) {
        isBehindBird = check;
    }

    public boolean getIsBehindBird() {
        return isBehindBird;
    }
}