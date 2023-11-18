package Prak12;

import javax.swing.*;
import java.awt.*;

public class AnimationWindow extends JFrame
{

    private Image[] frames;
    private int currentFrame;
    private Timer animationTimer;

    public AnimationWindow()
    {
        frames = new Image[4];
        frames[0] = Toolkit.getDefaultToolkit().getImage("1.jpeg");
        frames[1] = Toolkit.getDefaultToolkit().getImage("2.jpeg");
        frames[2] = Toolkit.getDefaultToolkit().getImage("3.jpeg");
        frames[3] = Toolkit.getDefaultToolkit().getImage("4.jpeg");

        currentFrame = 0;

        animationTimer = new Timer(100, e ->
        {
            currentFrame = (currentFrame + 1) % frames.length;
            repaint();
        });

        animationTimer.start();

        setTitle("Анимация");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(frames[currentFrame], 0, 0, null);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(AnimationWindow::new);
    }
}
