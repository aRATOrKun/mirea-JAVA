package Prak4_1;

class Shape
{
    public String getType()
    {
        return "форма";
    }

    public double getArea()
    {
        return 0;
    }

    public double getPerimeter()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "Это " + getType();
    }
}

class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String getType()
    {
        return "круг";
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", он имеет радиус " + radius;
    }
}

class Rectangle extends Shape
{
    protected double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType()
    {
        return "прямоугольник";
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    @Override
    public String toString()
    {
        return super.toString() + ", он имеет ширину " + width + " и длину " + height;
    }
}

class Square extends Rectangle
{
    public Square(double side)
    {
        super(side, side);
    }

    @Override
    public String getType()
    {
        return "квадрат";
    }

    @Override
    public String toString()
    {
        return super.toString() + ", он имеет равные стороны " + width;
    }
}

public class ShapeTester
{
    public static void main(String[] args)
    {
        Shape shape1 = new Circle(6);
        Shape shape2 = new Rectangle(4, 5);
        Shape shape3 = new Square(3);

        System.out.println(shape1);
        System.out.println("Площадь: " + shape1.getArea());
        System.out.println("Периметр: " + shape1.getPerimeter());

        System.out.println(shape2);
        System.out.println("Площадь: " + shape2.getArea());
        System.out.println("Периметр: " + shape2.getPerimeter());

        System.out.println(shape3);
        System.out.println("Площадь: " + shape3.getArea());
        System.out.println("Периметр: " + shape3.getPerimeter());
    }
}
