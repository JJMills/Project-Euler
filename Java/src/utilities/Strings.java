package utilities;

public class Strings {
    public static boolean isPalindrome(int number) {
        return isPalindrome(String.valueOf(number));
    }

    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - 1 - i]) return false;
        }
        return true;
    }
}
