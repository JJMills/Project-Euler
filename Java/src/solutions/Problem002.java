package solutions;

public class Problem002 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int total = 2; //Starting at 2 because the below excludes the first two values of the sequence.
		while (b < 4000000) {
			int c = a + b;
			a = b;
			b = c;
			if (c % 2 == 0) {
				total += c;
			}
		}
		System.out.println(total);
	}
}