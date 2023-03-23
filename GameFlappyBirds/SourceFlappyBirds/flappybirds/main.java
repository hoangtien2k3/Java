package GameFlappyBirds.SourceFlappyBirds.flappybirds;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ImagePanelExample extends JFrame {
    public ImagePanelExample() {
        super("Image Panel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một JPanel và đặt kích thước và địa điểm của nó
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(400, 300));

        // Tải ảnh từ URL hoặc đường dẫn tới tệp ảnh
        Image image = null;
        try {
            URL imageUrl = new URL("https://hanoispiritofplace.com/wp-content/uploads/2014/08/hinh-nen-chelsea-dep-6.jpg");
            image = ImageIO.read(imageUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Tạo một ImageIcon từ ảnh và đặt nó vào JLabel
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);

        // Thêm JLabel vào JPanel
        panel.add(label, BorderLayout.CENTER);

        // Thêm JPanel vào JFrame
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImagePanelExample());
    }
}