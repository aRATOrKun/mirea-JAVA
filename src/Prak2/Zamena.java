package Prak2;

public class Zamena
{
    public static void main(String[] args)
    {
        String[] arr = {"a", "b", "c", "d", "e"};

        System.out.println("Исходный массив:");
        for (String element : arr)
            System.out.print(element + " ");

        for (int i = 0; i < arr.length / 2; i++)
        {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("\nИзмененный массив:");
        for (String element : arr)
            System.out.print(element + " ");
    }
}
