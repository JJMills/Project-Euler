public class Problem4 {
	public static void main(String[] args) {
		int palindrome = 0;
		for (int i = 99; i > 0; i--) {
			for (int j = i; j > 0; j--) { //j = i to avoid repetition.
				int k = i * j;
				if (isPalindrome(k) && k > palindrome) {
					palindrome = k;
				}
			}
		}
		System.out.println(palindrome);
	}

	private static boolean isPalindrome(int input) {
		char[] chars = String.valueOf(input).toCharArray();
		int len = chars.length;
		for (int i = 0; i < len / 2; i++) {
			if (chars[i] != chars[len - 1 - i]) return false;
		}
		return true;
	}
}