package Prak2;

import java.util.Scanner;

public class HowMany
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        int wordCount = countWords(inputText);

        System.out.println("Количество слов во введенном тексте: " + wordCount);
    }

    public static int countWords(String text)
    {
        if (text == null || text.isEmpty())
            return 0;

        String[] words = text.split("\\s+");
        return words.length;
    }
}
