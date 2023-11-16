package Prak14;

import java.util.regex.*;

public class EmailValidator
{
    private static final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9._%+-]+@[a-z0-9.-]+[a-z0-9.]");

    public static boolean isValidEmail(String email)
    {
        Matcher matcher = EMAIL_REGEX.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args)
    {
        String[] validEmails = {"user@example.com", "root@localhost"};

        String[] invalidEmails = {"myhost@@@com.ru", "@my.ru", "Julia String."};

        for (String email : validEmails)
            System.out.println(email + ": " + isValidEmail(email));

        for (String email : invalidEmails)
            System.out.println(email + ": " + isValidEmail(email));
    }
}
