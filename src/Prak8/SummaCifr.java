package Prak8;

public class SummaCifr
{
    public static void main(String[] args)
    {
        int N = 123045;
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    public static int sumOfDigits(int n)
    {
        if (n == 0)
            return 0;

        return n % 10 + sumOfDigits(n / 10);
    }
}

