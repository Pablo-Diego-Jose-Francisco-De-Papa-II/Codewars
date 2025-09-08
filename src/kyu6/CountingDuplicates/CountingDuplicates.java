package kyu6.CountingDuplicates;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] textCharArray = text.toLowerCase().toCharArray();
        boolean[] countedChars = new boolean[text.length()];
        int duplicates = 0;

        for (int i = 0; i < textCharArray.length; i++) {
            if (countedChars[i]) continue;

            int count = 0;
            for (int j = i + 1; j < textCharArray.length; j++) {
                if (textCharArray[i] == textCharArray[j]) {
                    count++;
                    countedChars[j] = true;
                }
            }
            if (count > 0) duplicates++;
        }

        return duplicates;
    }
}
