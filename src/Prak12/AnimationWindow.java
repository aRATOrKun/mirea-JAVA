package Prak12;

/*import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class AnimationWindow {
    private JFrame frame;
    private JLabel animationLabel;
    private Timer animationTimer;
    private int currentFrame;

    public AnimationWindow() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        animationLabel = new JLabel();
        frame.add(animationLabel);

        BufferedImage[] frames = loadFrames(); // Загрузка последовательности кадров изображения
        int delay = 100; // Задержка между кадрами в миллисекундах

        animationTimer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame++;
                if (currentFrame >= frames.length) {
                    currentFrame = 0;
                }
                animationLabel.setIcon(new ImageIcon(frames[currentFrame]));
            }
        });

        currentFrame = -1;
    }

    private BufferedImage[] loadFrames() {
        // Здесь можно загрузить последовательность кадров изображения
        // и вернуть массив BufferedImage
        // Например:
        BufferedImage[] frames = new BufferedImage[4];
        frames[0] = loadImage("frame1.png");
        frames[1] = loadImage("frame2.png");
        frames[2] = loadImage("frame3.png");
        frames[3] = loadImage("frame4.png");
        return frames;
    }

    public void startAnimation() {
        if (animationTimer != null) {
            animationTimer.start();
        }
    }

    public static void main(String[] args) {
        AnimationWindow window = new AnimationWindow();
        window.startAnimation();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                window.frame.setVisible(true);
            }
        });
    }
}*/
