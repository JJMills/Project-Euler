package solutions;

public class Problem017 {
	private static final String[] ZERO_TO_NINE = {"zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine"};
	private static final String[] TEN_TO_NINETEEN = {"ten", "eleven", "twelve", "thirteen",
			"fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static final String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += parseValue(i).length();
		}
		System.out.println(sum);
	}

	private static String parseValue(int value) {
		//The parsing will omit useless characters.
		if (value < 100) {
			return parseTwoDigit(value);
		} else if (value == 1000) {
			return "onethousand";
		} else {
			String parsed_value = ZERO_TO_NINE[value / 100 % 10] + "hundred";
			int modulus = value % 100;
			if (modulus != 0) {
				parsed_value += "and" + parseTwoDigit(modulus);
			}
			return parsed_value;
		}
	}

	private static String parseTwoDigit(int value) {
		if (value < 10) {
			return ZERO_TO_NINE[value];
		} else if (value < 20) {
			return TEN_TO_NINETEEN[value - 10];
		} else {
			String parsed_value = TENS[value / 10 - 2];
			int modulus = value % 10;
			if (modulus != 0) {
				parsed_value += ZERO_TO_NINE[modulus];
			}
			return parsed_value;
		}
	}
}