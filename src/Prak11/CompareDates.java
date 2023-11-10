package Prak11;

import java.text.*;
import java.util.*;

public class CompareDates
{
    public static void main(String[] args) throws ParseException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время (в формате 'yyyy-MM-dd HH:mm:ss'): ");
        String inputDateTime = scanner.nextLine();

        Date submissionDateTime = new Date();
        submissionDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(inputDateTime);

        Date currentDateTime = new Date();

        if (currentDateTime.before(submissionDateTime))
            System.out.println("Дата и время больше текущей даты и времени");
        else if (currentDateTime.after(submissionDateTime))
            System.out.println("Дата и время меньше текущей даты и времени");
        else
            System.out.println("Дата и время совпадают");

        System.out.println("Дата и время сейчас: " + currentDateTime.toString());
        System.out.println("Дата и время введенная: " + submissionDateTime.toString());
    }
}
