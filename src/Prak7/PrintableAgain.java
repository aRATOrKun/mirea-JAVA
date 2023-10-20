package Prak7;

interface Printable
{
    void print();
}

class Magazine implements Printable
{
    private String name;

    public Magazine(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println("Журнал: " + name);
    }

    public static void printMagazines(Printable[] printables)
    {
        for (Printable printable : printables)
        {
            if (printable instanceof Magazine)
                printable.print();
        }
    }
}

class Book implements Printable
{
    private String name;

    public Book(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println("Книга: " + name);
    }

    public static void printBooks(Printable[] printables)
    {
        for (Printable printable : printables)
        {
            if (printable instanceof Book)
                printable.print();
        }
    }
}

public class PrintableAgain
{
    public static void main(String[] args)
    {
        Printable[] objects = {new Book("Моя автобиография"), new Magazine("Лучший журнал мира"), new Book("Права и обязанности")};

        for (Printable object : objects)
            object.print();
    }
}