package com.company;

public class Helper {
    /**
     *Функция проверки что строка является арабским числом
     *@param s - исходная строка
     * @return возвращает true если строка представляет арабское число
     */
    public static boolean checkArab(String s)
    {
        if (s == null || s.equals(""))
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean checkRoman(String s)
    {
        if (s == null || s.equals(""))
            return false;
        String permissibleSymbols = "IVX";

        for (int i = 0; i < s.length(); i++) {
            if (!permissibleSymbols.contains(s.charAt(i) + ""))
                return false;
        }
        return true;
    }

    private static int parse(char digit)
    {
        switch (digit){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
        }
        return 0;
    }

    public static int convertRomanToArab(String number)
    {
        int result = 0, previous = parse(number.charAt(0)),current;
        for (int i = 1; i < number.length() && (current = parse(number.charAt(i))) != 0; i++) {
            result += previous < current ? -previous : previous;
            previous = current;
        }
        result += previous;
        return result;
    }

    public static String convertArabToRoman(int number)
    {
        String result = "";
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500 };
        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D"};

        int counter = symbols.length - 1;
        while (counter >= 0)
        {
            while (number >= values[counter]){
                number -= values[counter];
                result += symbols[counter];
            }
            counter--;
        }
        return result;
    }
}
