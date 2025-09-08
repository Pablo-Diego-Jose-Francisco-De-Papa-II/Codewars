package kyu4.StripComments;

import java.util.Arrays;

public class StripComments {

    // 🙏

    public static String stripComments(String text, String[] commentSymbols) {
        char[] charArray = text.toCharArray();
        boolean comment = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '\n' || Arrays.asList(commentSymbols).contains(String.valueOf(charArray[i]))) {
                int j = i - 1;
                while (j >= 0 && charArray[j] == ' ') {
                    charArray[j] = '\0';
                    j--;
                }
            }
        }

        for (char c : charArray) {
            if (c == '\n') {
                comment = false;
                result.append('\n');
                continue;
            }

            if (Arrays.asList(commentSymbols).contains(String.valueOf(c))) {
                comment = true;
                continue;
            }

            if (comment) continue;

            if (c == '\0') continue;

            result.append(c);
        }

        int len = result.length();
        while (len > 0 && (result.charAt(len - 1) == ' ' || result.charAt(len - 1) == '\0')) {
            result.deleteCharAt(len - 1);
            len--;
        }

        return result.toString();
    }

}

