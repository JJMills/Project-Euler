import java.util.HashMap;
import java.util.Map;

public class Problem023 {
	private static final int LIMIT = 28123;

	public static void main(String[] args) {
		System.out.println(getAbundantSum());
	}

	private static int getAbundantSum() {
		int sum = 0;
		boolean[] abundant_numbers = getAbundantNumbers();
		for (int i = 1; i <= LIMIT; i++) {
			if (!isSumOfTwoAbundantNumbers(abundant_numbers, i)) {
				sum += i;
			}
		}
		return sum;
	}

	private static boolean isSumOfTwoAbundantNumbers(boolean[] abundant_numbers, int n) {
		for (int i = 0; i < n / 2 + 1; i++) {
			if (abundant_numbers[i] && abundant_numbers[n - i]) {
				return true;
			}
		}
		return false;
	}

	private static boolean[] getAbundantNumbers() {
		boolean[] numbers = new boolean[LIMIT + 1];
		for (int i = 1; i <= LIMIT; i++) {
			if (getSumOfFactors(i) > i) {
				numbers[i] = true;
			}
		}
		return numbers;
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
			while (number % prime == 0) {
				if (!primes.containsKey(prime)) {
					primes.put(prime, 1);
				} else {
					primes.put(prime, primes.get(prime) + 1);
				}
				number /= prime;
			}
		}
		return primes;
	}
}
