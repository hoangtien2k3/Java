package src.game.GameFlappyBirds.SourceFlappyBirds.flappybirds;

import src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework.Objects;

import java.awt.*;

public class Bird extends Objects {
    private float vt = 0; // tốc độ rơi của con chim hiện tại set cho nó bằng 0;
    private boolean isFlying = false; // có ngĩa kiểm tra xem con chim có đang bay hay không.
    private Rectangle rectangle; // hình chữ nhật.
    private boolean isLive = true; // kiểm tra con chim còn sống hay không

    public Bird(int x, int y, int w, int h) {
        super(x, y, w, h);
        rectangle = new Rectangle(x, y, w, h);
    }

    public void setLive(boolean check){
        isLive = check;
    }

    public boolean getLive(){
        return isLive;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setVt(float vt) {
        this.vt = vt;
    }

    public void update(long deltaTime) {
        // Có nghĩa là vận tốc ban đầu của con chim bằng gia tốc
        vt += FlappyBirds.g;

        // thay đổi tọa độ Y bằng tọa độ Y + vận tốc. ( Thì bây giờ tốc độ rơi của con chim nó sẽ tăng lên)
        this.setPosY(this.getPosY() + vt);
        this.rectangle.setLocation((int)this.getPosX(), (int)this.getPosY());

        // vt < 0 có nghĩa là nó đang bay lên.
        if (vt < 0) {
            isFlying = true;
        } else {
            isFlying = false; // thì nó không bay lên thôi.
        }
    }

    public void fly() {
        vt = -3;
    }

    public boolean getIsFlying() {
        return isFlying;
    }
}
