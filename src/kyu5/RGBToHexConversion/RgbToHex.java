package kyu5.RGBToHexConversion;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return String.format("%02x%02x%02x".toUpperCase(), validate(r), validate(g), validate(b));
    }

    private static int validate(int value) {
        return Math.min(Math.max(value, 0), 255);
    }
}
