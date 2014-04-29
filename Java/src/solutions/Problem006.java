package solutions;

public class Problem006 {
	public static void main(String[] args) {
		int sum = summationTo(100);
		System.out.println(sum * sum - summationOfSquaresTo(100));
	}

	private static int summationTo(int n) {
		return (n * (n + 1)) / 2;
	}

	private static int summationOfSquaresTo(int n) {
		return (n * (n + 1) * (2 * n + 1)) / 6;
	}
}