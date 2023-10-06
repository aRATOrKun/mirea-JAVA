package Prak1;
import java.util.Scanner;

public class MinMax
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();

        int sum = 0;
        int max = array[0];
        int min = array[0];

        int i = 0;
        do
        {
            sum += array[i];
            i++;
        } while (i < size);

        i = 1;
        while (i < size)
        {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
            i++;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        scanner.close();
    }
}
