package kyu6.BreakCamelCase;

class Solution {
    public static String camelCase(String input) {
        StringBuilder txt = new StringBuilder();

        for (char ch : input.toCharArray()) {
            txt.append(Character.isLowerCase(ch) ? ch : " " + ch);
        }
        return txt.toString();
    }
}
