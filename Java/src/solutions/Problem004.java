package solutions;

import framework.Problem;
import framework.ProblemInfo;
import utilities.Strings;

@ProblemInfo(
        description = "Largest palindrome product",
        number = 4
)
public class Problem004 extends Problem {
    @Override
    public Object solve() {
        int palindrome = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) { //j = i to avoid repetition.
                int k = i * j;
                if (Strings.isPalindrome(k) && k > palindrome) {
                    palindrome = k;
                }
            }
        }
        return palindrome;
    }
}