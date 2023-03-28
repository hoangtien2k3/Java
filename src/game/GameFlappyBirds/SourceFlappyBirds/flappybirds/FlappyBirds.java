package src.game.GameFlappyBirds.SourceFlappyBirds.flappybirds;

import src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework.AFrameOnImage;
import src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework.Animation;
import src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework.GameScreen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FlappyBirds extends GameScreen {
    private BufferedImage birds;
    private Animation bird_anim;

    // gia tốc hướng tâm (tốc độ rơi của con chim con chim)
    public static float g = 0.15f;

    private Bird bird; // đối tượng bird quản lý hình ảnh của con chim
    private Ground ground; // đối tượng ground quản lý mặt đất
    private ChimneyGround chimneyGround; // đối tượng chimneyGround quản lý đối tượng các cột
    private int Point = 0;

    private int BEGIN_SCREEN = 0;
    private int GAMEPLAY_SCREEN = 1;
    private int GAMEOVER_SCREEN = 2;

    private int CurrentScreen = BEGIN_SCREEN;
    
    public FlappyBirds() throws IOException {
        // set chiều dài và chiều rộng cho màn hình
        super(800, 580);
        try {
            // add bức ảnh con chim Flappy Bird vào.
            birds = ImageIO.read(new File("src/game/GameFlappyBirds/Image/bird_sprite.png"));
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
        Point = 0;
        chimneyGround.resertChimneys();
    }

    @Override
    public void GAME_UPDATE(long deltaTime) {

        if (CurrentScreen == BEGIN_SCREEN) { // bắt đầu vào game
            resertGame();
        } else if (CurrentScreen == GAMEPLAY_SCREEN){ // khi choi game thì các animation mới chạy
            // nếu con chim còn sống thì nó vẩy cánh
            if (bird.getLive()) {
                bird_anim.Update_Me(deltaTime);
            }

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
            for(int i = 0; i < ChimneyGround.SIZE; i++) {
                if (bird.getPosX() > chimneyGround.getChimney(i).getPosX() && !chimneyGround.getChimney(i).getIsBehindBird() && (i % 2 == 0)) {
                    Point++;
                    chimneyGround.getChimney(i).setIsBehindBird(true);
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
        // Set màu nền cho background
        g2.setColor(Color.decode("#b8daef")); // #b8daef
        g2.fillRect(0, 0, MASTER_WIDTH, MASTER_HEIGHT);

//        try {
//            Image backgroundImage = ImageIO.read(new File("src.game.GameFlappyBirds/Image/chimney3.jpg"));
//            g2.drawImage(backgroundImage, 0, 0, null);
//        }catch (IOException ex) {
//            ex.printStackTrace();
//        }


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
            g2.drawString("Nhấn Space để chơi game!", 310 , 330);
        }
        if (CurrentScreen == GAMEOVER_SCREEN) {
            g2.setColor(Color.blue);
            g2.drawString("Chết rồi, Nhấn Space để chơi lại!!!", 310 , 280);
        }
        g2.setColor(Color.red);
        g2.drawString("Điểm Số: " + Point, 120, 35 );
        g2.setColor(Color.blue);
        g2.drawString("hoangtien2k3:", 30, 35);
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