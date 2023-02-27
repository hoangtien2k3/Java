package src.java.Swing.ProjectSwingGameXO;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Board extends JPanel {
    private static final int N = 3;
    private static final int M = 3;
    public static final int ST_DRAW = 0;
    public static final int ST_WIN = 1;
    public static final int ST_NORMAL = 2;

    //0: Hòa (hết nước không ai thắng cả), 1: Player hiện tại thắng, 2: Player hiện tại chưa thắng (còn nước đánh tiếp)

    private EndGameListener endGameListener;
    private Image imgX;
    private Image imgO;
    private Cell[][] matrix = new Cell[N][M];
    private String currentPlayer = Cell.EMPTY_VALUE;

    public Board(String player){
        this();
        this.currentPlayer = player;
    }

    public Board(){
        this.initMatrix();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int x = e.getX();
                int y = e.getY();

                if(currentPlayer.equals(Cell.EMPTY_VALUE)){
                    return;
                }

                //phát ra âm thanh
                soundClick();

                //Tính toán xem x, y rơi vào ô nào trong board, sau đó vẽ hình x, o tùy ý
                for(int i = 0 ; i < N; i++){
                    for(int j = 0 ; j < M; j++){
                        Cell cell = matrix[i][j];

                        int cXStart = cell.getX();
                        int cYStart = cell.getY();

                        int cXEnd = cXStart + cell.getW();
                        int cYEnd = cYStart + cell.getH();

                        if(x >= cXStart && x <= cXEnd && y >= cYStart && y <= cYEnd){
                            if(cell.getValue().equals(Cell.EMPTY_VALUE)){
                                cell.setValue(currentPlayer);
                                repaint();
                                int result = checkWin(currentPlayer);
                                if(endGameListener != null){
                                    endGameListener.end(currentPlayer, result);
                                }

                                if(result == ST_NORMAL){
                                    currentPlayer = currentPlayer.equals(Cell.O_VALUE) ? Cell.X_VALUE : Cell.O_VALUE;
                                }
                            }
                        }
                    }
                }
            }
        });

        try{
            imgX = ImageIO.read(getClass().getResource("x.png"));
            imgO = ImageIO.read(getClass().getResource("o.png"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private synchronized void soundClick(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("click.wav"));
                    clip.open(audioInputStream);
                    clip.start();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void initMatrix(){
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M; j++){
                Cell cell = new Cell();
                matrix[i][j] = cell;
            }
        }
    }


    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setEndGameListener(EndGameListener endGameListener) {
        this.endGameListener = endGameListener;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void reset(){
        this.initMatrix();
        this.setCurrentPlayer(Cell.EMPTY_VALUE);
        repaint();
    }

    //0: Hòa (hết nước không ai thắng cả), 1: Player hiện tại thắng, 2: Player hiện tại chưa thắng (còn nước đánh tiếp)
    public int checkWin(String player){
        //Đường chéo thứ nhất
        if(this.matrix[0][0].getValue().equals(player) && this.matrix[1][1].getValue().equals(player) && this.matrix[2][2].getValue().equals(player)){
            return ST_WIN;
        }

        //Đường chéo thứ hai
        if(this.matrix[0][2].getValue().equals(player) && this.matrix[1][1].getValue().equals(player) && this.matrix[2][0].getValue().equals(player)){
            return ST_WIN;
        }

        //Dòng thứ 1
        if(this.matrix[0][0].getValue().equals(player) && this.matrix[0][1].getValue().equals(player) && this.matrix[0][2].getValue().equals(player)){
            return ST_WIN;
        }

        //Dòng thứ 2
        if(this.matrix[1][0].getValue().equals(player) && this.matrix[1][1].getValue().equals(player) && this.matrix[1][2].getValue().equals(player)){
            return ST_WIN;
        }

        //Dòng thứ 3
        if(this.matrix[2][0].getValue().equals(player) && this.matrix[2][1].getValue().equals(player) && this.matrix[2][2].getValue().equals(player)){
            return ST_WIN;
        }

        //Cột thứ 1
        if(this.matrix[0][0].getValue().equals(player) && this.matrix[1][0].getValue().equals(player) && this.matrix[2][0].getValue().equals(player)){
            return ST_WIN;
        }

        //Cột thứ 2
        if(this.matrix[0][1].getValue().equals(player) && this.matrix[1][1].getValue().equals(player) && this.matrix[2][1].getValue().equals(player)){
            return ST_WIN;
        }

        //Cột thứ 2
        if(this.matrix[0][2].getValue().equals(player) && this.matrix[1][2].getValue().equals(player) && this.matrix[2][2].getValue().equals(player)){
            return 1;
        }


        if(this.isFull()){
            return ST_DRAW;
        }

        return ST_NORMAL;
    }

    private boolean isFull(){
        int number = N * M;

        int k = 0;
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M; j++){
                Cell cell = matrix[i][j];
                if(!cell.getValue().equals(Cell.EMPTY_VALUE)){
                    k++;
                }
            }
        }

        return k == number;
    }

    @Override
    public void paint(Graphics g) {
        int w = getWidth() / 3;
        int h = getHeight() / 3;

        Graphics2D graphic2d = (Graphics2D) g;



        int k = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                int x = j * w;
                int y = i * h;

                //Cập nhật lại ma trận
                Cell cell = matrix[i][j];
                cell.setX(x);
                cell.setY(y);
                cell.setW(w);
                cell.setH(h);

                Color color = k % 2 == 0 ? Color.BLUE : Color.YELLOW;
                graphic2d.setColor(color);
                graphic2d.fillRect(x,y, w, h);

                if(cell.getValue().equals(Cell.X_VALUE)){
                    Image img = imgX;
                    graphic2d.drawImage(img, x, y, w, h, this);
                }else if(cell.getValue().equals(Cell.O_VALUE)){
                    Image img = imgO;
                    graphic2d.drawImage(img, x, y, w, h, this);
                }

                k++;
            }
        }
    }


}
