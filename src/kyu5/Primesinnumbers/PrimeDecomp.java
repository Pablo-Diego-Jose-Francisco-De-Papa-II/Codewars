package kyu5.Primesinnumbers;

import java.util.TreeMap;

public class PrimeDecomp {

    public static String factors(int n) {
        TreeMap<Integer, Integer> primes = new TreeMap<>();

        int divisor = 2;
        int exponente = 0;

        while (divisor <= n) {
            if (n % divisor == 0) {
                n = n / divisor;
                exponente++;
            } else {
                if (exponente != 0) {
                    primes.put(divisor, exponente);
                }
                exponente = 0;
                divisor++;
            }
        }

        primes.put(divisor, exponente);

        return formatAnswer(primes);
    }

    public static String formatAnswer(TreeMap<Integer, Integer> primes) {
        StringBuilder answer = new StringBuilder();

        for (var number : primes.entrySet()) {
            answer.append(number.getValue() == 1
                    ? "(%s)".formatted(number.getKey())
                    : "(%s**%s)".formatted(number.getKey(), number.getValue()));
        }

        return answer.toString();
    }

}
