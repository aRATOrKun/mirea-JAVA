package Prak13;

public class ILikeJava
{
    public static void main(String[] args)
    {
        String str = "I like Java!!!";

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается '!!!': " + endsWithExclamation);

        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается с 'I like': " + startsWithILike);

        boolean containsJava = str.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        int position = str.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + position);

        String replacedStr = str.replace("a", "o");
        System.out.println("Замена символов с 'a' на 'o': " + replacedStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Верхний регистр: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Нижний регистр: " + lowerCaseStr);

        String substring = str.substring(str.indexOf("Java"), str.indexOf("Java") + "Java".length());
        System.out.println("Подстрока: " + substring);
    }
}