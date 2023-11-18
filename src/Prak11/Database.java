package Prak11;

import java.util.Date;

public class Database
{
    public static void main(String[] args)
    {
        String lastName = "Горохов";
        Date currentDateTime = new Date();
        Date receivingDateTime = new Date(123, 8, 2, 9, 0, 0);

        System.out.println("Фамилия разработчика: " + lastName);
        System.out.println("Дата и время получения задания: " + receivingDateTime);
        System.out.println("Дата и время сдачи задания: " + currentDateTime);
    }
}
