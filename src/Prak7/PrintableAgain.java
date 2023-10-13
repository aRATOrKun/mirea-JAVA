package Prak7;

public class PrintableAgain
{
    public static void main(String[] args) {
        PrintableAgain[] printableItems = new PrintableAgain[][]{
                new Magazine("Java Magazine"),
                new Magazine("Science Today"),
                new Book("Introduction to Java"),
                new Book("History of Science"+"/"),

        };

        Magazine.printMagazines(printableItems);

        Book.printBooks(printableItems);
    }
}
class Book extends PrintableAgain {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static void printBooks(PrintableAgain[] printable) {
        for (PrintableAgain item : printable) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Книга: " + book.getTitle());
            }
        }
    }
}
class Magazine extends PrintableAgain {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Статический метод для вывода названий журналов из массива Printable[]
    public static void printMagazines(PrintableAgain[] printable) {
        for (PrintableAgain item : printable) {
            if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println("Журнал: " + magazine.getTitle());
            }
        }
    }
}
