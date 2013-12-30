import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem021 {
	public static void main(String[] args) {
		System.out.println(getAmicableNumberSumUnder(10000));
	}

	private static int getAmicableNumberSumUnder(int limit) {
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

	private static int getSumOfFactors(int number) {
		if (number == 1) {
			return 1;
		}
		Map<Integer, Integer> primes = getPrimeFactorisation(number);
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

	private static Map<Integer, Integer> getPrimeFactorisation(int number) {
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
