package Prak11;

import java.text.*;
import java.util.*;

public class StudentBirth
{
    private String name;
    private Date birthDate;

    public StudentBirth(String name, Date birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getname()
    {
        return name;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public String toString(String dateFormat)
    {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        return "Имя: " + name + ", Дата рождения: " + formatter.format(birthDate);
    }

    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = formatter.parse("09.01.2005");
        StudentBirth student = new StudentBirth("Михаил", birthDate);
        System.out.println(student.toString("dd.MM.yyyy"));
        System.out.println(student.toString("dd MMMM yyyy"));
        System.out.println(student.toString("EEEE, dd MMMM yyyy"));
    }
}