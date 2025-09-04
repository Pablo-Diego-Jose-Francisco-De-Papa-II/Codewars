package kyu6.SplitStrings;

public class StringSplit {
    public static String[] solution(String s) {
        return s.isEmpty() ? new String[0] : (s.length() % 2 != 0 ? s + "_" : s).split("(?<=\\G..)");
    }
}
