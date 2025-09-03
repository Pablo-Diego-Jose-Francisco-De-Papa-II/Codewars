package kyu5.SimplePigLatin;

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder piggedStr = new StringBuilder();
        char firstChar;

        for (String word : str.split(" ")) {
            firstChar = word.charAt(0);

            piggedStr.append(Character.isLetter(firstChar) ? word.substring(1) + firstChar + "ay " : word);
        }

        return piggedStr.toString().trim();
    }
}