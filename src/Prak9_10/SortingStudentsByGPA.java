package Prak9_10;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{

    @Override
    public int compare(Student student1, Student student2)
    {
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    public void quickSort(Student[] students, int low, int high)
    {
        if (low < high)
        {
            int partitionIndex = partition(students, low, high);
            quickSort(students, low, partitionIndex - 1);
            quickSort(students, partitionIndex + 1, high);
        }
    }

    private int partition(Student[] students, int low, int high)
    {
        double pivot = students[high].getGpa();
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if (students[j].getGpa() >= pivot)
            {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args)
    {
        Student student1 = new Student("Дима", 3.9);
        Student student2 = new Student("Миша", 3.8);
        Student student3 = new Student("Паша", 4.0);

        Student[] students = {student1, student2, student3};

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.quickSort(students, 0, students.length - 1);

        for (Student student : students)
            System.out.println(student.getName() + " - " + student.getGpa());
    }

}

class Student
{
    private String name;
    private double gpa;

    public Student(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName()
    {
        return name;
    }

    public double getGpa()
    {
        return gpa;
    }
}
