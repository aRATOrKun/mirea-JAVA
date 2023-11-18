package Prak12;

import javax.swing.*;

public class ImageWindow extends JFrame
{
    private ImageIcon imageIcon;
    private JLabel imageLabel;

    public ImageWindow(String imagePath)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setTitle("Image Window");

        imageIcon = new ImageIcon(imagePath);
        imageLabel = new JLabel(imageIcon);
        add(imageLabel);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Необходимо указать путь к картинке");
            return;
        }

        String imagePath = args[0];
        SwingUtilities.invokeLater(() -> new ImageWindow(imagePath));
    }
}
