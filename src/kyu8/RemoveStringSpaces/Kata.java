package kyu8.RemoveStringSpaces;

public class Kata {
    public static String noSpace(final String x) {
        return String.join("", x.split(" "));
    }
}