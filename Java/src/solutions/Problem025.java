package solutions;

import java.math.BigInteger;

public class Problem025 {
	public static void main(String[] args) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ZERO;
		BigInteger limit = BigInteger.TEN.pow(999);
		int count = 0;
		while (b.compareTo(limit) != 1) {
			BigInteger temp = b.add(a);
			a = b;
			b = temp;
			count++;
		}
		System.out.println(count);
	}
}
