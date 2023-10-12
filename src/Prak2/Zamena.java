package Prak2;

public class Zamena
{
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};

        System.out.println("Исходный массив:");
        for (String element : array) {
            System.out.print(element + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("\nИзмененный массив:");
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
