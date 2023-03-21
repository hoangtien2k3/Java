package GameFlappyBirds.SourceFlappyBirds.flappybirds;

import GameFlappyBirds.SourceFlappyBirds.gamesframework.AFrameOnImage;
import GameFlappyBirds.SourceFlappyBirds.gamesframework.Animation;
import GameFlappyBirds.SourceFlappyBirds.gamesframework.GameScreen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class FlappyBirds extends GameScreen {
    private BufferedImage birds;
    private Animation bird_anim;



    public static float g = 0.1f; // gia tốc hướng tâm, gia tốc trọng trường g = 9,8 hoặc g = 10

    private Bird bird; // đối tượng bird quản lý hình ảnh của con chim
    private Ground ground; // đối tượng ground quản lý mặt đất
    private ChimneyGround chimneyGround; // đối tượng chimneyGround quản lý đối tượng các cột

    private int BEGIN_SCREEN = 0;
    private int GAMEPLAY_SCREEN = 1;
    private int GAMEOVER_SCREEN = 2;

    private int CurrentScreen = BEGIN_SCREEN;
    
    public FlappyBirds() throws IOException {
        super(800, 600);

        try {
            // add bức ảnh con chim Flappy Bird vào.
            birds = ImageIO.read(new File("GameFlappyBirds/Image/bird_sprite.png"));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // số lần flappy bird xuất hiện. (có nghĩ là 3 con chim nó se đè lên nhau để tạo ra hình ảnh di chuyển).
        // 70 có nghĩ là set thời gian vỗ cánh của con chim (milisecond)
        bird_anim = new Animation(70);


        // sét tạo độ, và độ dài, rộng cho con chim.
        AFrameOnImage f;
        f = new AFrameOnImage(0, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(120, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);


        bird = new Bird(350, 250, 50, 50);
        ground = new Ground();
        chimneyGround = new ChimneyGround();

        BeginGame();
    }


    public static void main(String[] args) throws IOException {
        new FlappyBirds();
    }



    // hàm này sẽ resert con chim khi con chim bị gameOver
    public void resertGame() {
        bird.setPos(350, 250);
        bird.setVt(0);
        bird.setLive(true);
    }


    @Override
    public void GAME_UPDATE(long deltaTime) {

        if (CurrentScreen == BEGIN_SCREEN) { // bắt đầu vào game
            resertGame();
        } else if (CurrentScreen == GAMEPLAY_SCREEN){ // khi choi game thì các animation mới chạy
            // nếu con chim còn sống thì nó vẩy cánh
            if (bird.getLive())
                bird_anim.Update_Me(deltaTime);


            bird.update(deltaTime);
            ground.Update();
            chimneyGround.update();


            for(int i = 0; i < ChimneyGround.SIZE; i++) {
                // intersect này kiểm tra có giao nhau hay không.
                if (bird.getRectangle().intersects(chimneyGround.getChimney(i).getRectangle())) {
                    bird.setLive(false);
//                    System.out.println("Set Live = False");
                }
            }

            /*
             có nghĩa là khi con chim chạm vào mặt đất thì gameover
             bird.getPosY() + bird.getH() > ground.getYGround() : là lấy ra độ dài đường bảo của con chim để kiểm tra.
             getPosY: tạo độ y con chim và getH tạo tạo độ hình chữ nhật bao quanh con chim.
            */
            if (bird.getPosY() + bird.getH() > ground.getYGround()) {
                CurrentScreen = GAMEOVER_SCREEN;
            }


        } else { // kết thức gameover

        }
    }

    @Override
    public void GAME_PAINT(Graphics2D g2) {

        // vẽ cái ống khói.
        chimneyGround.paint(g2);

        // sẽ cái mặt đất
        ground.Paint(g2);


        if (bird.getIsFlying()) {
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, -1);
        } else {
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, 0);
        }


        if (CurrentScreen == BEGIN_SCREEN) {
            g2.setColor(Color.blue);
            g2.drawString("Start Game !!!", 200 , 300);
        }
        if (CurrentScreen == GAMEOVER_SCREEN) {
            g2.setColor(Color.red);
            g2.drawString("End Game !!!", 200 , 300);
        }

    }

    @Override
    public void KEY_ACTION(KeyEvent e, int Event) {

        // có nghĩa chỗ này nó sẽ bắt sự kiện nhấn, (con chim đang rơi, nếu nhấn thì con chim nó sẽ bay lên)
        if (Event == KEY_PRESSED) {

            if (CurrentScreen == BEGIN_SCREEN) {
                CurrentScreen = GAMEPLAY_SCREEN;
            } else if (CurrentScreen == GAMEPLAY_SCREEN) {
                // nghĩa là nếu con chim còn sống thì nói mới có thể bay được.
                if (bird.getLive()) {
                    bird.fly();
                }

            } else if (CurrentScreen == GAMEOVER_SCREEN){
                CurrentScreen = BEGIN_SCREEN;
            }

        }

    }

}
