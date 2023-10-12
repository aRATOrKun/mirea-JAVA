package Prak3;
import java.util.Arrays;
import java.util.Random;

public class Randomim
{
    public static void main(String[] args)
    {
        int arrayLength = 10;

        double[] array1 = RandomArrUsingMath(arrayLength);

        System.out.println("Массив до сортировки (используя Math.random()):");
        printArray(array1);

        Arrays.sort(array1);

        System.out.println("\nМассив после сортировки (используя Math.random()):");
        printArray(array1);

        double[] array2 = RandomArrUsingRandomClass(arrayLength);

        System.out.println("\nМассив до сортировки (используя класс Random):");
        printArray(array2);

        Arrays.sort(array2);

        System.out.println("\nМассив после сортировки (используя класс Random):");
        printArray(array2);
    }

    public static double[] RandomArrUsingMath(int length)
    {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static double[] RandomArrUsingRandomClass(int length)
    {
        double[] array = new double[length];
        Random random = new Random();
        for (int i = 0; i < length; i++)
            array[i] = random.nextDouble();
        return array;
    }

    public static void printArray(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
