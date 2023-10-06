package Prak1;

public class Factorial
{
    public static long calculateFactorial(int number)
    {
        if (number < 0)
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");

        long factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }

    public static void main(String[] args)
    {
        int number = 5;
        long result = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + result);
    }
}