package kyu5.HumanReadableTime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        int min = seconds / 60 % 60;
        int sec = seconds / 3600 % 60;

        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
