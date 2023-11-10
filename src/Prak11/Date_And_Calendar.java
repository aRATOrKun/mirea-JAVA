package Prak11;

import java.util.*;

public class Date_And_Calendar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (1-12):");
        int month = scanner.nextInt();
        System.out.println("Введите число:");
        int day = scanner.nextInt();
        System.out.println("Введите часы:");
        int hours = scanner.nextInt();
        System.out.println("Введите минуты:");
        int minutes = scanner.nextInt();

        Date date = new Date(year - 1900, month - 1, day, hours, minutes);

        System.out.println("Объект Date: " + date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);

        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
