package Prak8;

public class ot_1_do_n
{
    public static void main(String[] args)
    {
        int n = 10;
        printNumbers(1, n);
    }

    public static void printNumbers(int current, int n)
    {
        if (current > n)
            return;
        else
        {
            System.out.println(current);
            printNumbers(current + 1, n);
        }
    }
}

