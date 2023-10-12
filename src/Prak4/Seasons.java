package Prak4;

public class Seasons
{
    public static void printSeasonDescription(Season season)
    {
        switch (season)
        {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    enum Season
    {
        Весна(10),
        Лето(25),
        Осень(15),
        Зима(0);

        private int averageTemperature;

        Season(int averageTemperature)
        {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature()
        {
            return averageTemperature;
        }

        public String getDescription()
        {
            if (this == Лето)
                return "Теплое время года";
            else
                return "Холодное время года";
        }
    }

    public static void main(String[] args)
    {
        Season myFavoriteSeason = Season.Лето;

        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + myFavoriteSeason.getDescription());

        printSeasonDescription(Season.Лето);

        for (Season season : Season.values())
            System.out.println(season + ", средняя температура: " + season.getAverageTemperature() + ", " + season.getDescription());
    }

}
