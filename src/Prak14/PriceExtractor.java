package Prak14;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor
{
    public static void main(String[] args)
    {
        String text = "Список цен: 25.98 USD, 1000 RUB, 10.5 EU, 44 ERR, 0.004 EU";

        List<Double> usdPrices = extractPrices(text, "USD");
        List<Double> rubPrices = extractPrices(text, "RUB");
        List<Double> euPrices = extractPrices(text, "EU");

        System.out.println("USD: " + usdPrices);
        System.out.println("RUB: " + rubPrices);
        System.out.println("EU: " + euPrices);
    }

    public static List<Double> extractPrices(String text, String currency)
    {
        List<Double> prices = new ArrayList<>();
        String regex = "\\d+(\\.\\d+)? " + currency;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
        {
            String priceStr = matcher.group().split(" ")[0];
            double price = Double.parseDouble(priceStr);
            prices.add(price);
        }

        return prices;
    }
}