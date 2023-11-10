package Prak8;

public class PalindromChecker
{
    public static void main(String[] args)
    {
        String word = "дед";
        if (isPalindrom(word))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isPalindrom(String word)
    {
        if (word.length() <= 1)
            return true;
        if (word.charAt(0) != word.charAt(word.length() - 1))
            return false;
        return isPalindrom(word.substring(1, word.length() - 1));
    }
}

