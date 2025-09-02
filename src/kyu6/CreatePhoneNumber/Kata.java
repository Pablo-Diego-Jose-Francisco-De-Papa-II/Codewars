package kyu6.CreatePhoneNumber;

import java.util.Arrays;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        return "(%d%d%d) %d%d%d-%d%d%d%d".formatted(Arrays.stream(numbers).boxed().toArray());
    }
}
