package Prak1;

public class Harmonic
{
    public static void main(String[] args)
    {
        int n = 10;

        double sum = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++)
        {
            sum += 1.0 / i;
            System.out.printf("H%d = %f%n", i, sum);
        }
    }
}
