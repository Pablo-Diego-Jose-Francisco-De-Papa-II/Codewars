package kyu8.SquarenSum;

public class Kata {
    public static int squareSum(int[] n) {
        int answer = 0;

        for (int num : n) {
            answer += num * num;
        }

        return answer;
    }
}
