package kyu6.WhatCenturyIsIt;

public class Solution {
    public static String whatCentury(int year)  {
        String century = String.valueOf((year + 99)/ 100);
        int lastTwoDigits = Integer.parseInt(century) % 100;
        char lastDigit = century.charAt(century.length() - 1);

        if (lastTwoDigits >= 11 && lastTwoDigits <= 13) {
            return century + "th";
        }

        return switch (lastDigit) {
            case '1' -> century + "st";
            case '2' -> century + "nd";
            case '3' -> century + "rd";
            default  -> century + "th";
        };
    }
}