package Prak9_10;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents
{

    public static void main(String[] args)
    {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Миша", 19));
        list1.add(new Student("Дима", 21));
        list1.add(new Student("Паша", 23));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Леша", 18));
        list2.add(new Student("Илья", 20));
        list2.add(new Student("Света", 22));

        List<Student> mergedList = mergeSort(list1, list2);

        for (Student student : mergedList)
            System.out.println(student);
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2)
    {
        List<Student> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size())
        {
            if (list1.get(i).getAge() < list2.get(j).getAge())
            {
                mergedList.add(list1.get(i));
                i++;
            }
            else
            {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size())
        {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size())
        {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static class Student
    {
        private String name;
        private int age;

        public Student(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        @Override
        public String toString()
        {
            return "Имя: " + name + ", Возраст: " + age;
        }
    }
}
