package solutions;

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
		int sum = 1;
		int n = number;
		for (int prime = 2; n != 1; prime++) {
			int count = 0;
			int total = 1;
			while (n % prime == 0) {
				total += Math.pow(prime, ++count);
				n /= prime;
			}
			sum *= total;
		}
		return sum - number;
	}
}