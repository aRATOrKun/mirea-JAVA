package Prak3;

public class Converter
{
    private double exchangeRate;

    public Converter(double exchangeRate)
    {
        this.exchangeRate = exchangeRate;
    }

    public double convert(double amount)
    {
        return amount * exchangeRate;
    }

    public static void main(String[] args)
    {
        double exchangeRateUSDToEUR = 0.8;

        Converter converter = new Converter(exchangeRateUSDToEUR);

        double amountInUSD = 100.0;

        double amountInEUR = converter.convert(amountInUSD);

        System.out.println(amountInUSD + " USD = " + amountInEUR + " EUR");
    }
}