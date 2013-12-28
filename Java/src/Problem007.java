public class Problem007 {
	public static void main(String[] args) {
		int i = 0;
		int val = 2;
		while (true) {
			if (isPrime(val) && ++i == 10001) {
				break;
			}
			val++;
		}
		System.out.println(val);
	}

	private static boolean isPrime(int value) {
		if (value <= 1) return false;
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0) return false;
		}
		return true;
	}
}