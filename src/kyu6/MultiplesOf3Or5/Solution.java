package kyu6.MultiplesOf3Or5;

public class Solution {
    public static int solution(int number) {
        int sum = 0;

        for (int i = 3; i < number; i++) {
            sum += (i % 3 == 0 || i % 5 == 0) ? i : 0;
        }

        return sum;
    }
}