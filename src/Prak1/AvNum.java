package Prak1;
import java.util.Scanner;

public class AvNum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ввести размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создать массив
        int[] numbers = new int[size];

        // Вводим данные
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++)
        {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Сумма Элементов
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum += numbers[i];


        // Среднее арифметическое
        double average = (double) sum / size;

        // Выводим результаты
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);

        // Закрываем Scanner
        scanner.close();
    }
}
