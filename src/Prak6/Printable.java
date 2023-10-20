package Prak6;

interface Printablee
{
        void print();
}

class Book implements Printablee
{
    private String title;

    public Book(String title)
    {
        this.title = title;
    }

    public void print()
    {
        System.out.println("Книга: " + title);
    }
}

class Shop implements Printablee
{
    private String name;

    public Shop(String name)
    {
        this.name = name;
    }

    public void print()
    {
        System.out.println("Магазин: " + name);
    }
}

public class Printable
{
    public static void main(String[] args)
    {
        Printablee[] objects = {new Book("Моя автобиография"), new Shop("Лучший магазин мира"), new Book("Права и обязанности")};

        for (Printablee object : objects)
            object.print();
    }
}