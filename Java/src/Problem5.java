public class Problem5 {
	public static void main(String[] args) {
		int lcm = 1;
		for (int i = 2; i <= 20; i++) {
			lcm = lowestCommonMultiple(lcm, i);
		}
		System.out.println(lcm);
	}

	private static int lowestCommonMultiple(int a, int b) {
		int val = a;
		while (val % b != 0) {
			val += a;
		}
		return val;
	}
}