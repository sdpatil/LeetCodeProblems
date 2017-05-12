package com.misc;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class ConvertBase {
    public static void main(String[] argv) {
        String result = convertBase("615", 7, 13);
        System.out.println("Result " + result);
    }

    public static String convertBase(String numAsString, int b1, int b2) {
        boolean isNegative = numAsString.startsWith("-");

        int value = convertFromBaseToDecimal(numAsString, b1);
        if (isNegative)
            return "-" + convertFromDecimalToBase(value, b2);
        else
            return convertFromDecimalToBase(value, b2);
    }

    private static int convertFromBaseToDecimal(String numAsString, int base) {
        boolean isNegative = numAsString.startsWith("-");
        int numAsInt = 0;
        for (int i = (isNegative ? 1 : 0); i < numAsString.length(); i++) {
            numAsInt = (numAsInt) * base;
            numAsInt = numAsInt + (Character.isDigit(numAsString.charAt(i)) ? numAsString.charAt(i) - '0' :
                    numAsString.charAt(i) - 'A' + 10);
        }
        return numAsInt;
    }

    private static String convertFromDecimalToBase(int number, int base) {
        return number == 0 ? "" :
                convertFromDecimalToBase(number / base, base) +
                        (char) (number % base >= 10 ? 'A' + number % base - 10 :
                                '0' + number % base);
    }
}
