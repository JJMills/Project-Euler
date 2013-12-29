import java.math.BigInteger;

public class Problem015 {
	public static void main(String[] args) {
		System.out.println(getBinomialCoefficient(40, 20));
	}

	private static long getBinomialCoefficient(int n, int k) {
		BigInteger val = BigInteger.ONE;
		for (int i = n; i >= n - k + 1; i--) {
			val = val.multiply(BigInteger.valueOf(i));
		}
		for (int i = 2; i <= k; i++) {
			val = val.divide(BigInteger.valueOf(i));
		}
		return val.longValue();
	}
}