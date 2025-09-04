package kyu6.ConvertStringToCamelCase;

class Solution {
    static String toCamelCase(String s) {
        String[] array = s.split("[-_]");
        StringBuilder camelCased = new StringBuilder();

        for (int i = 1; i < array.length; i++) {
            camelCased.append(array[i].substring(0, 1).toUpperCase()).append(array[i].substring(1));
        }

        return camelCased.toString();
    }
}