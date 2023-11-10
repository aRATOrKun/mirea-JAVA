package Prak9_10;

public class TestStudent implements Comparable<TestStudent>
{
    private int iDNumber;
    private String name;

    public TestStudent(int iDNumber, String name)
    {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getiDNumber()
    {
        return iDNumber;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int compareTo(TestStudent other)
    {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    public static void insertionSort(TestStudent[] students)
    {
        for (int i = 1; i < students.length; i++)
        {
            TestStudent key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args)
    {
        TestStudent[] students = {
                new TestStudent(3, "Дима"),
                new TestStudent(1, "Миша"),
                new TestStudent(2, "Паша")
        };

        insertionSort(students);

        for (TestStudent student : students)
            System.out.println(student.getiDNumber() + " " + student.getName());
    }
}

