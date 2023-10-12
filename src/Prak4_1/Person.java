package Prak4_1;

public class Person
{
    private String fullName;
    private int age;

    public Person() {}

    public Person(String fullName, int age)
    {
        this.fullName = fullName;
        this.age = age;
    }

    public void move()
    {
        System.out.println(fullName + " двигается");
    }

    public void talk()
    {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.fullName = "Иван Иванов";
        person1.age = 30;
        Person person2 = new Person("Петр Петров", 25);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
