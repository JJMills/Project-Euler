package solutions;

public class Problem019 {
	public static void main(String[] args) {
		int count = 0;
		int weekday = 2; // 1 - 7 mapping to Mon - Sun, 1st Jan 1901 is a Tuesday
		for (int year = 1901; year <= 2000; year++) {
			for (int month = 0; month < 12; month++) {
				if (weekday == 7) {
					count++;
				}
				weekday += getDaysInMonth(month, year) % 7;
				if (weekday > 7) {
					weekday -= 7;
				}
			}
		}
		System.out.println(count);
	}

	private static int getDaysInMonth(int month, int year) {
		int[] days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = days_in_month[month];
		if (month == 1 && year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					days += 1;
				}
			} else {
				days += 1;
			}
		}
		return days;
	}
}
