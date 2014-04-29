package solutions;

public class Problem009 {
	public static void main(String[] args) {
		loop:
		for (int a = 1; a < 998; a++) {
			for (int b = a + 1; b < 998; b++) {
				for (int c = b + 1; c < 998; c++) {
					if (a + b + c == 1000 && a * a + b * b == c * c) {
						System.out.println(a * b * c);
						break loop;
					}
				}
			}
		}
	}
}