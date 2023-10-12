package Prak5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape
{
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape
{
    private int radius;

    public Circle(Color color, int x, int y, int radius)
    {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

class Rectangle extends Shape
{
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class MoreShapes extends JPanel
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Random random = new Random();

    private Shape[] shapes;

    public MoreShapes()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++)
        {
            Color randomColor = getRandomColor();
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int shapeType = random.nextInt(2);

            if (shapeType == 0)
            {
                int radius = random.nextInt(50) + 10;
                shapes[i] = new Circle(randomColor, x, y, radius);
            }
            else
            {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes[i] = new Rectangle(randomColor, x, y, width, height);
            }
        }
    }

    private Color getRandomColor()
    {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (Shape shape : shapes)
            shape.draw(g);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("More (Random) Shapes");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                MoreShapes drawingPanel = new MoreShapes();
                frame.add(drawingPanel);

                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
