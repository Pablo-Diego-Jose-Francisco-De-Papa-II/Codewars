package kyu7.DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        char[] characters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (char vowel : characters) {
            str = str.replace(String.valueOf(vowel), "");
        }

        return str;
    }
}
