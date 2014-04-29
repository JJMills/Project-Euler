package solutions;

import framework.Problem;
import framework.ProblemInfo;
import utilities.NumberTheory;

import java.util.LinkedHashMap;
import java.util.Map;

@ProblemInfo(
        description = "Amicable numbers",
        number = 21
)
public class Problem021 extends Problem {
    @Override
    public Object solve() {
        return getAmicableNumberSumUnder(10000);
    }

    private int getAmicableNumberSumUnder(int limit) {
        Map<Integer, Integer> map = new LinkedHashMap<>(limit - 1);
        for (int i = 1; i < limit; i++) {
            map.put(i, getSumOfFactors(i));
        }
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int sum = entry.getValue();
            if (sum > entry.getKey() && sum < limit && map.get(sum).equals(entry.getKey())) {
                total += entry.getKey() + entry.getValue();
            }
        }
        return total;
    }

    private int getSumOfFactors(int number) {
        if (number == 1) {
            return 1;
        }
        Map<Integer, Integer> primes = NumberTheory.getPrimeFactorisation(number);
        int sum = 1;
        for (Map.Entry<Integer, Integer> entry : primes.entrySet()) {
            int total = 0;
            for (int i = 0; i <= entry.getValue(); i++) {
                total += Math.pow(entry.getKey(), i);
            }
            sum *= total;
        }
        return sum - number;
    }
}
