package Prak14;

import java.util.regex.Pattern;

public class DateValidator
{
    private static final Pattern DATE_REGEX = Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|2[0-9])[0-9]{2}|9999)");

    public static boolean isValidDate(String date)
    {
        return DATE_REGEX.matcher(date).matches();
    }

    public static void main(String[] args) {
        String[] validDates = {"29/02/2000", "30/04/2003", "01/01/2003"};
        String[] invalidDates = {"30-04-2003", "1/1/1899"};

        for (String date : validDates)
            System.out.println(date + ": " + isValidDate(date));

        for (String date : invalidDates)
            System.out.println(date + ": " + isValidDate(date));
    }
}