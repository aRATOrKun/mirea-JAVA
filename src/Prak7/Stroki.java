package Prak7;

interface StringOperations
{
    int countCharacters(String s);
    String getOddCharacters(String s);
    String reverseString(String s);
}
class ProcessStrings implements StringOperations
{

    @Override
    public int countCharacters(String s)
    {
        return s.length();
    }

    @Override
    public String getOddCharacters(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            if ((i+1) % 2 != 0)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String reverseString(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
public class Stroki
{
    public static void main(String[] args)
    {
        StringOperations stringProcessor = new ProcessStrings();

        String s = "Hello, World!";
        int charCount = stringProcessor.countCharacters(s);
        String oddChars = stringProcessor.getOddCharacters(s);
        String reversed = stringProcessor.reverseString(s);

        System.out.println("Символов в строке: " + charCount);
        System.out.println("Нечетные символы: " + oddChars);
        System.out.println("Инвертированная строка: " + reversed);
    }
}

