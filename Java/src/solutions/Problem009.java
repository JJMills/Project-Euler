package solutions;

import framework.Problem;
import framework.ProblemInfo;

@ProblemInfo(
        description = "Special Pythagorean triplet",
        number = 9
)
public class Problem009 extends Problem {
    @Override
    public Object solve() {
        for (int a = 1; a < 998; a++) {
            for (int b = a + 1; b < 998; b++) {
                for (int c = b + 1; c < 998; c++) {
                    if (a + b + c == 1000 && a * a + b * b == c * c) {
                        return a * b * c;
                    }
                }
            }
        }
        return "Computation failed";
    }
}