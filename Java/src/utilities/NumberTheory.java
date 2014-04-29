package utilities;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class NumberTheory {
    public static int summationTo(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int summationOfSquaresTo(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static int lowestCommonMultiple(int a, int b) {
        int val = a;
        while (val % b != 0) {
            val += a;
        }
        return val;
    }

    public static long getBinomialCoefficient(int n, int k) {
        BigInteger val = BigInteger.ONE;
        for (int i = n; i >= n - k + 1; i--) {
            val = val.multiply(BigInteger.valueOf(i));
        }
        for (int i = 2; i <= k; i++) {
            val = val.divide(BigInteger.valueOf(i));
        }
        return val.longValue();
    }

    public static boolean isPrime(int value) {
        if (value <= 1) return false;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static Map<Integer, Integer> getPrimeFactorisation(int number) {
        Map<Integer, Integer> primes = new HashMap<>();
        if (number == 1) {
            primes.put(2, 0);
        }
        for (int prime = 2; number != 1; prime++) {
            int count = 0;
            while (number % prime == 0) {
                count++;
                number /= prime;
            }
            if (count != 0) {
                primes.put(prime, count);
            }
        }
        return primes;
    }
}
