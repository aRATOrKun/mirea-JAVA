package Prak14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomePluses
{
    public static void main(String[] args)
    {
        String text1 = "(1 + 8) – 9 / 4";
        String text2 = "6 / 5 – 2 * 9";

        System.out.println(checkText(text1));
        System.out.println(checkText(text2));
    }

    public static boolean checkText(String text)
    {
        String pattern = "\\d( \\+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        return matcher.find();

    }
}
